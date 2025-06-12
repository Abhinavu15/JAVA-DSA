Given an `m x n` matrix, print all elements in zigzag order (alternating between moving right and left for each row).

Input Format

- First line contains two integers `m` and `n` (1 ≤ m, n ≤ 100), representing the number of rows and columns.

- Next `m` lines each contain `n` space-separated integers representing the matrix elements.

Output Format

- Print all elements in zigzag order, separated by spaces.

  ********************************************************************************************

  Answer:
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();

        // Initialize boundaries
        int top = 0, bottom = m - 1;
        int left = 0, right = n - 1;
        while (top <= bottom && left <= right) {
            // Traverse Left to Right
            for (int j = left; j <= right; j++) {
                
                System.out.print(matrix[top][j]+" ");
                
            }
            top++;
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    System.out.print(matrix[top][j]+" ");
                }
                top++;
            }
        }
    }
}
