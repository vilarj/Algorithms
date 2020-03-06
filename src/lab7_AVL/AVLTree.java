package lab7_AVL;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

public class AVLTree < T extends Comparable <? super T>> {
    public AVLNode root;
    public AVLTree () {
        root = null;
    }
    public void setRoot (AVLNode rootNode) {
        root = rootNode;
    }

    public int getHeight() {
        if (isEmpty())
            return 0;
        return root.getHeight();
    }

    public int getRealHeight () {
        if (isEmpty())
            return 0;
        return root.getRealHeight();
    }

    public int getNumberOfNodes() {
        return root.getNumberOfNodes();
    }

    public boolean isEmpty() {
        return (root == null);
    }

    public void clear() {
        root = null;
    }

    public boolean contains (T entry) {
        return contains(root, entry);
    }

    private boolean contains (AVLNode node, T entry) {
        int compare = entry.compareTo(node.getData()); // comparing current entry in the root

        if (isEmpty()) // tree is empty - false
            return false;
        if (compare < 0) // go into the left subtree
            return contains(node.left, entry);
        if (compare > 0) // go into the right subtree
            return contains(node.right, entry);
        return true;
    }

    private enum LeftRight {
        LL, LR, RL, RR
    }

    private boolean delete (AVLNode node) {
        // to implement; do rotation only for extra credit if you can
        return true;
    }

    public boolean delete (T entry) {
        AVLNode node = root;
        // find the node
        if (node == null)
            return false;  // should be fixed

        return delete (node);
    }

    public void insert (T entry) {
        AVLNode toAdd = new AVLNode (entry);

        if (root == null) {
            root = toAdd; // new root
        }

        insert(toAdd, entry); // inserting

        AVLNode r = updateHeights (toAdd);

        if (r != null) {
            int balance = r.getLeftHeight() - r.getRightHeight();

            if (balance != 2 && balance != -2)
                throw new IllegalStateException();
            LeftRight rotation = getRotation (toAdd, r);

            switch (rotation) {
                case LL:
                    llRotate (r);
                    break;
                case LR:
                    lrRotate (r);
                    break;
                case RL:
                    rlRotate (r);
                    break;
                case RR:
                    rrRotate (r);
                    break;
                default:
                    return;
                    //throw new IllegalStateException ();
            }
        }
    }

    public void insert (AVLNode t, T entry) {
        AVLNode z = new AVLNode(entry);
        AVLNode y, x;

        y = null;
        x = t;

        while (x != null) {
            y = x;

            if (z.data.compareTo(x.data) < 0) {
                x = x.left;
            }
            else {
                x = x.right;
            }
        }
        z = y;

        if (y == null) { root = z; }

        else if (z.data.compareTo(y.data) > 0) { y.left = z; }
        else { y.right = z; }
    }

    private AVLNode leftRotation (AVLNode node) {
        AVLNode l_parent = node.right;
        node.right = l_parent.left;
        l_parent.left = node;

        updateHeights(node);
        updateHeights(l_parent);

        return l_parent;
    }

    private AVLNode rightRotation (AVLNode node) {
        AVLNode r_parent = node.left;
        node.left = r_parent.right;
        r_parent.right = node;

        updateHeights(node);
        updateHeights(r_parent);

        return r_parent;
    }

    private LeftRight getRotation (AVLNode node, AVLNode nail) {
        return null;
    }

    private AVLNode updateHeights (AVLNode node) {
        AVLNode p = node.parent;
        int oldHeight = 0; // not sure how to declare it
        int rightHeight;
        int leftHeight;
        while(p != null && oldHeight != p.getHeight())
        {
            oldHeight = p.height;
            if(node.isLeftChild())
            {
                rightHeight = p.rightHeight;
                p.height = Math.max(node.height + 1, rightHeight);
            }
            else
            {
                leftHeight = p.leftHeight;
                p.height = Math.max(node.height + 1, leftHeight);
            }
            if(p.height == oldHeight)
                break;
            node = p;
            p = node.parent;

        }
        return node;
    }

    private void llRotate (AVLNode r) {
        AVLNode c = r.left;

        r.right = r;
        c.left = r;
        r.parent = c;

        r.resetHeights();
        c.resetHeights();

        AVLNode p = c.parent;

        if(p != null)
        {
            p.resetHeights();
            updateHeights(p);
        }
    }

    private void rrRotate (AVLNode r) {
        AVLNode c = r.left;
        r.left = c.right;
        c.right = r;
        r.parent = c;

        r.resetHeights();
        c.resetHeights();

        AVLNode p = r.parent;

        if(p != null)
        {
            p.resetHeights();
            updateHeights(p);
        }
    }

    private void lrRotate (AVLNode r) {
        AVLNode p = r.parent;
        AVLNode c = r.left;
        AVLNode g = c.right;

        r.left = g.right;
        c.right = g.left;
        g.left = c;

        r.resetHeights();
        c.resetHeights();
        g.resetHeights();

        if(p != null)
        {
            p.resetHeights();
            updateHeights(p);
        }
    }

    private void rlRotate (AVLNode r) {
        AVLNode p = r.parent;
        AVLNode c = r.right;
        AVLNode g = c.left;

        r.right = g.left;
        c.left = g.right;
        g.right = c;
        g.left = r;

        c.resetHeights();
        r.resetHeights();


        if(g.parent != null)
        {
            p.resetHeights();
            updateHeights(g.parent);
        }
    }

    private class AVLNode {
        T data;
        AVLNode left;
        AVLNode right;
        AVLNode parent;
        int height;
        int leftHeight;
        int rightHeight;

        public AVLNode (T newEntry ) {
            data = newEntry;
            left = null; right = null; parent = null;
            height = 1;
            leftHeight = rightHeight = 0;
        }

        protected T getData() {
            return data;
        }

        protected void setData (T data) {
            this.data = data;
        }

        protected AVLNode getParent () {
            return parent;
        }

        protected AVLNode getLeft () {
            return left;
        }

        protected AVLNode getRight () {
            return right;
        }

        protected void setLeft( AVLNode node) {
            left = node;
        }

        protected void setRight (AVLNode node) {
            right = node;
        }

        protected void setParent (AVLNode p) {
            parent = p;
        }

        protected int getLeftHeight () {
            return leftHeight;
        }

        protected int getRightHeight () {
            return rightHeight;
        }

        protected void setLeftHeight ( int h) {
            leftHeight = h;
        }

        protected void setRightHeight ( int h) {
            rightHeight = h;
        }

        protected boolean isLeftChild () {
            return (parent != null && this == parent.getLeft());
        }

        protected boolean isRightChild () {
            return (parent != null && this == parent.getRight());
        }

        protected int getHeight() {
            return height;
        }

        protected void computeHeight () {
            height = 1 + (leftHeight > rightHeight ? leftHeight : rightHeight);
        }

        protected int getNumberOfNodes () {
            return root.getHeight();
        }

        protected void resetHeights() {
            leftHeight = (left == null ? 0 : left.getHeight());
            rightHeight = (right == null) ? 0 : right.getHeight();
            computeHeight ();
        }

        private AVLNode Minimun (AVLNode tree, T k) {
            return min (tree.left, k);
        }

        private AVLNode min (AVLNode x, T k) {
            while (x.left != null) {
                x = x.left;
            }
            return x;
        }

        private AVLNode Maximun (AVLNode tree, T k) {
            return max (tree.right, k);
        }

        private AVLNode max (AVLNode x, T k) {
            while (x.right != null) {
                x = x.right;
            }
            return x;
        }

        protected AVLNode getSuccessor () {
            // to implement; needed for delete()

            return null; // should be fixed
        }

        protected int getRealHeight () {
            // to implement as recursive method
            return 0; // needs to be fixed
        }
    }

    protected Iterator <T> getLevelOrderIterator() {
        if (isEmpty())
            throw new IllegalStateException ("No iteration on empty tree");
        return new LevelOrderIterator();
    }

    private class LevelOrderIterator implements Iterator <T> {

        private ArrayList <AVLNode > nodeQueue;

        public LevelOrderIterator () {
            nodeQueue = new ArrayList <> ();
            nodeQueue.add (root);
        }

        @Override
        public boolean hasNext() {
            return (!nodeQueue.isEmpty());
        }

        @Override
        public T next() {
            if (!hasNext())
                throw new NoSuchElementException ();
            AVLNode node = nodeQueue.remove(0);
            T item = node.getData();
            AVLNode left = node.getLeft();
            if (left != null)
                nodeQueue.add(left);
            AVLNode right = node.getRight();
            if (right != null)
                nodeQueue.add(right);
            return item;
        }
    }

    private class InOrderIterator implements Iterator <T> {

        private Stack <AVLNode> stack;
        private AVLNode currNode;

        public InOrderIterator () {
            stack = new Stack <> ();
            currNode = root;
        }

        @Override
        public boolean hasNext() {
            return !stack.isEmpty() || currNode != null;
        }

        @Override
        public T next() {
            T item;
            while (currNode != null ) {
                stack.push (currNode);
                currNode = currNode.getLeft();
            }
            if (!stack.isEmpty()) {
                currNode = stack.pop();
                item = currNode.getData();
                currNode = currNode.getRight();
            }
            else
                throw new NoSuchElementException ();
            return item;
        }
    }

    public Iterator <T> getInorderIterator () {
        if (isEmpty())
            throw new IllegalStateException ("No iteration on empty tree");
        return new InOrderIterator();
    }
}
