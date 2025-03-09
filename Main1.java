import java.util.*;

class Main {
    public static void main(String[] args) {
        int n = 4;
        int[][] matrix = {
            {1, 0, 0, 0},
            {1, 1, 0, 0},
            {0, 1, 0, 1},
            {1, 1, 1, 1}
        }; 
        findPath(n, matrix);
    }
 
    public static void findPath(int n, int[][] matrix) {
        int[][] vis = new int[n][n];  
        for (int i = 0; i < n; i++) {
            Arrays.fill(vis[i], 0);
        } 

        String move = "";
        if (matrix[0][0] == 1) {
            solve(0, 0, matrix, n, move, vis);
        } else {
            System.out.println("No path exists.");
        }
    }
 
    public static void solve(int i, int j, int[][] matrix, int n, String move, int[][] vis) { 

        if (i == n - 1 && j == n - 1) {
            System.out.println("Path found: " + move);
            return;
        } 

        vis[i][j] = 1; 

        if (i + 1 < n && vis[i + 1][j] == 0 && matrix[i + 1][j] == 1) {
            solve(i + 1, j, matrix, n, move + "D", vis);
        }
        // Move Left
        if (j - 1 >= 0 && vis[i][j - 1] == 0 && matrix[i][j - 1] == 1) {
            solve(i, j - 1, matrix, n, move + "L", vis);
        }
        // Move Up
        if (i - 1 >= 0 && vis[i - 1][j] == 0 && matrix[i - 1][j] == 1) {
            solve(i - 1, j, matrix, n, move + "U", vis);
        }
        // Move Right
        if (j + 1 < n && vis[i][j + 1] == 0 && matrix[i][j + 1] == 1) {
            solve(i, j + 1, matrix, n, move + "R", vis);
        }
 
        vis[i][j] = 0;
    }
}
