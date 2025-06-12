
You are given a r x c matrix where every row and every column is sorted in ascending order. Your task is to determine whether a given number x exists in the matrix. Instead of scanning the entire matrix, you can use a smart search technique starting from the top-right or bottom-left corner. From there, you can eliminate a row or column in each step based on the comparison with x. This approach ensures an efficient search in O(r + c) time complexity. You must print "YES" if x is found and "NO" otherwise. This problem tests your ability to apply logical optimization techniques to matrix-based search problems.

Input Format:
First line: two integers r and c (number of rows and columns)
Next r lines: each contains c integers (sorted row-wise and column-wise)
Last line: an integer x to be searched

Output Format:
Print "YES" if x is found, otherwise print "NO"
************************************************************************************************

Answer: 

import java.util.Scanner;

public class MatrixSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int r = scanner.nextInt();
        int c = scanner.nextInt();

        int[][] matrix = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int x = scanner.nextInt();

        // Start from the top-right corner
        int currentRow = 0;
        int currentCol = c - 1;

        boolean found = false;

        while (currentRow < r && currentCol >= 0) {
            if (matrix[currentRow][currentCol] == x) {
                found = true;
                break;
            } else if (matrix[currentRow][currentCol] > x) {
                // If current element is greater than x, move left (eliminate current column)
                currentCol--;
            } else {
                // If current element is smaller than x, move down (eliminate current row)
                currentRow++;
            }
        }

        if (found) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}
