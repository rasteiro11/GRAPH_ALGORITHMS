import java.util.ArrayList;
import java.util.List;

/**
 * Vertex
 */
public class Vertex {

    private String name;
    private List<Vertex> adjacencyList;

    public Vertex(String name) {
        this.name = name;
        this.adjacencyList = new ArrayList<>();
    }

    public void addNeighbor(Vertex vertex) {
        adjacencyList.add(vertex);
    }

    public void showNeighbor() {
        for (Vertex v : adjacencyList) {
            System.out.println(v);
        }
    }

    @Override
    public String toString() {
        return name;
    }

}
