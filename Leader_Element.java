A leader element in an array is an element that is greater than all the elements to its right. Given an array of integers, find all leader elements in the array and print them in the same order as they appear in the array.

Input Format

- The first line contains an integer `n` (1 ≤ n ≤ 1000), the size of the array.

- The second line contains `n` space-separated integers representing the elements of the array (0 ≤ arr[i] ≤ 10^9).

Output Format

- Print all leader elements separated by spaces in the order they appear in the array.

 


Constraints:
- 1 ≤ n ≤ 1000

- 0 ≤ arr[i] ≤ 10^9


Example:
Sample Input

6

16 17 4 3 5 2

Sample Output

17 5 2

**************************************************************************************************************************
Answer:

  import java.util.*;
public class Leader{
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=s.nextInt();
    }
    for(int i=0;i<n-1;i++){
      int flag=1;
      for(int j=i+1;j<n;j++){
        if(arr[i]<=arr[j])flag=0;
      }
      if(flag==1)System.out.print(arr[i]+" ");
    }
    System.out.print(arr[n-1]);
  }
}
