import java.text.Normalizer.Form;
import java.util.List;

/**
 * BellmanFordAlgorithm
 */
public class BellmanFordAlgorithm {

    private List<Vertex> vertexList;
    private List<Edge> edgeList;

    public BellmanFordAlgorithm(List<Vertex> vertexList, List<Edge> edgeList) {
        this.vertexList = vertexList;
        this.edgeList = edgeList;
    }

    public void run(Vertex source) {
        source.setDistance(0);

        // V-1 iterations (in worst case the longest path contains V)
        for (int i = 0; i < vertexList.size() - 1; i++) {

            // RELAXATION
            for (Edge edge : edgeList) {
                Vertex u = edge.getStartVertex();
                Vertex v = edge.getTargetVertex();

                if (u.getDistance() + edge.getWeight() < v.getDistance()) {
                    v.setDistance(u.getDistance() + edge.getWeight());
                    v.setPredecessor(u);
                }
            }
        }
        // if we make an additional relaxation and there is shorter paths
        // then we know that there is a negative cycle in the network
        for (Edge edge : edgeList) {
            if (edge.getStartVertex().getDistance() != Double.MAX_VALUE) {
                if (hasCycle(edge)) {
                    System.out.println("There is a negative cycle...");
                }
            }
        }
    }

    private boolean hasCycle(Edge edge) {
        return edge.getStartVertex().getDistance() + edge.getWeight() < edge.getTargetVertex().getDistance();
    }

    public void shortestPathTo(Vertex vertex) {
        if (vertex.getDistance() == Double.MAX_VALUE) {
            System.out.println("There is no path from source to given vertex...");
            return;
        }

        Vertex actual = vertex;
        while (actual.getPredecessor() != null) {
            System.out.println(actual);
            actual = actual.getPredecessor();
        }
    }

}
