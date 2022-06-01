import java.util.ArrayList;
import java.util.List;

/**
 * Vertex
 */
public class Vertex {

    private String name;
    private boolean visited;
    private boolean beingvisited;
    private List<Vertex> adjacencyList;

    public Vertex(String name) {
        this.name = name;
        this.adjacencyList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public boolean isBeignVisited() {
        return beingvisited;
    }

    public void setBeignVisited(boolean isBeignVisited) {
        this.beingvisited = isBeignVisited;
    }

    public List<Vertex> getNeighbors() {
        return adjacencyList;
    }

    public void addNeighbor(Vertex v) {
        this.adjacencyList.add(v);
    }

    @Override
    public String toString() {
        return name + " - ";
    }

}
