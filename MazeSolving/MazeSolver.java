/** MazeSolver */
public class MazeSolver {

    private int startRow;
    private int startCol;
    private int[][] maze;
    private boolean[][] visited;

    public MazeSolver(int[][] maze, int startRow, int startCol) {
        this.maze = maze;
        this.visited = new boolean[maze.length][maze.length];
        this.startRow = startRow;
        this.startCol = startCol;
    }

    public void findWay() {
        if (dfs(startRow, startCol)) {
            System.out.println("Solution  Exists");
        } else {
            System.out.println("Solution Does not Exists");
        }
    }

    private boolean isFeasible(int x, int y) {
        if (x < 0 || x > maze.length - 1)
            return false;
        if (y < 0 || y > maze.length - 1) {
            return false;
        }
        if (visited[x][y]) {
            return false;
        }
        if (maze[x][y] == 1) {
            return false;
        }
        return true;
    }

    private boolean dfs(int x, int y) {
        if (x == maze.length - 1 && y == maze.length - 1) {
            return true;
        }

        if (isFeasible(x, y)) {

            visited[x][y] = true;

            if (dfs(x + 1, y))
                return true;

            if (dfs(x - 1, y))
                return true;

            if (dfs(x, y + 1))
                return true;

            if (dfs(x, y - 1))
                return true;

            visited[x][y] = false;
            return false;

        }

        return false;
    }

}
