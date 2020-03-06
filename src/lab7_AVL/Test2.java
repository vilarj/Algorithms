package lab7_AVL;

import lab7_AVL.AVLTree;

public class Test2 {
    public static void main(String[] args) {
        AVLTree<Integer> tree = new AVLTree<>();

        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);



        System.out.println("height: " + tree.getHeight());
    }
}