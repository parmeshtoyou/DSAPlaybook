package feb;

public class Main {

    public static void main(String[] args) {
        char[][] grid = new char[][]{
                {'1', '1', '1', '0', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };

        Solution200 solution200 = new Solution200 ();
        int result = solution200.numIslands (grid);
        System.out.println (result);
    }
}
