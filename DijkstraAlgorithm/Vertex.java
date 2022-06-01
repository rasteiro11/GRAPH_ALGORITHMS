import java.util.ArrayList;
import java.util.List;

/**
 * Vertex
 */
public class Vertex implements Comparable<Vertex> {

    private String name;
    private boolean isVisited;
    private List<Edge> adjacencyList;
    // distance form the starting vertice
    private double distance;
    // the previous vertex on the shortest path
    private Vertex predecessor;

    public Vertex(String name) {
        this.name = name;
        this.adjacencyList = new ArrayList<>();
        this.distance = Double.MAX_VALUE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean isVisited) {
        this.isVisited = isVisited;
    }

    public List<Edge> getAdjacencyList() {
        return adjacencyList;
    }

    public void addNeighbor(Edge e) {
        this.adjacencyList.add(e);
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public Vertex getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(Vertex predecessor) {
        this.predecessor = predecessor;
    }

    @Override
    public int compareTo(Vertex o) {
        return Double.compare(this.distance, o.getDistance());
    }

    @Override
    public String toString() {
        return name;
    }

}
