package feb;

public class Solution200 {

    public int numIslands(char[][] grid) {
        if (grid.length == 0) {
            return 0;
        }
        int counter = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    dfs (grid, i, j);
                    counter++;
                }
            }
        }
        return counter;
    }

    void dfs(char[][] grid, int i, int j) {
        if (i > grid.length -1 || j > grid[0].length - 1 || i < 0 || j < 0) {
            return;
        }
        if(grid[i][j] == '0') return;
        grid[i][j] = '0';
        dfs (grid, i + 1, j); //right
        dfs (grid, i - 1, j); //left
        dfs (grid, i, j - 1); //top
        dfs (grid, i, j + 1); //bottom
    }
}
