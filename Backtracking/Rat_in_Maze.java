/*You are given an n x n maze where:

1 represents a valid path,

0 represents a blocked cell.

The rat starts at position (0, 0) and wants to reach (n-1, n-1). It can move in 4 directions: Down (D) and Right (R) but only onto cells with value 1.

Your task is to print the first path you find from the source to the destination. If no path exists, print "NO PATH".

Input Format:
First line: An integer n (the size of the grid).
Next n lines: Each line contains n space-separated integers (0 or 1) representing the maze.
Output Format:
A single string of directions representing the path.
Or "NO PATH" if no path exists.*/
Answer:

import java.util.Scanner;
public class Main {
    static boolean pathFound = false;
    static String path = "";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] maze = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                maze[i][j] = sc.nextInt();
        boolean[][] visited = new boolean[n][n];
        if(maze[n-1][n-1] == 0){
          System.out.print("NO PATH");
          return;
        }
        if (maze[0][0] == 1)
            findPath(0, 0, maze, visited, n, "");
        if (pathFound)
            System.out.println(path);
        else
            System.out.println("NO PATH");
    }
    static void findPath(int i, int j, int[][] maze, boolean[][] visited, int n, String currentPath) {
        if (i == n - 1 && j == n - 1) {
            path = currentPath;
            pathFound = true;
            return;
        }
        if (i < 0 || j < 0 || i >= n || j >= n || maze[i][j] == 0 || visited[i][j])
            return;
        visited[i][j] = true;
        findPath(i + 1, j, maze, visited, n, currentPath + "D");
        findPath(i, j + 1, maze, visited, n, currentPath + "R");
        visited[i][j] = false;
    }
}
