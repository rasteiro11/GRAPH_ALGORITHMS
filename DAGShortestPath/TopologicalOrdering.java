import java.util.List;
import java.util.Stack;

/**
 * TopologicalOrdering
 */
public class TopologicalOrdering {

    private Stack<Vertex> stack;

    public TopologicalOrdering(List<Vertex> graph) {
        this.stack = new Stack<>();

        for (int i = 0; i < graph.size(); i++) {
            if (!graph.get(i).isVisited()) {
                dfs(graph.get(i));
            }

        }
    }

    public void dfs(Vertex vertex) {
        vertex.setVisited(true);

        // all the neigbors in a DFS manner
        for (Edge e : vertex.getNeighbors()) {
            if (!e.getTarget().isVisited())
                dfs(e.getTarget());

        }
        stack.push(vertex);
    }

    public Stack<Vertex> getStack() {
        return stack;
    }

}
