package lab12_shortest_path;

public class Edge {
    private int whereTo;
    private int cost;

    public Edge (int whereTo, int cost) {
        this.whereTo = whereTo;
        this.cost = cost;
    }

    public int getWhereTo () {
        return whereTo;
    }

    public int getCost () {
        return cost;
    }
}
