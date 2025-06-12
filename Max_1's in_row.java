Given a binary matrix (a matrix filled with only 0s and 1s), find the row index (0-based) that contains the maximum number of 1s. If multiple rows have the same maximum number of 1s, return the smallest row index among them.
 
Input Format
- The first line contains two integers `rows` and `cols` representing the dimensions of the matrix.
- The next `rows` lines each contain `cols` integers (0s or 1s) representing the elements of the matrix.
 
Output Format
- A single integer representing the row index with the maximum number of 1s.
***************************************************************************************************************************

Answer:

import java.util.*;
public class Bin{
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    int r=s.nextInt();
    int c=s.nextInt();
    int arr[][]=new int[r][c];
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        arr[i][j]=s.nextInt();
      }
    }
    int max=0,maxs=-1;
    for(int i=0;i<r;i++){
      int count=0;
      for(int j=0;j<c;j++){
        if(arr[i][j]==1)count++;
      }
      if(count>max){
        max=count;
        maxs=i;
      }
    }
    System.out.print(maxs);
    
    
  }
}
