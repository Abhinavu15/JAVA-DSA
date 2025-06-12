Question:
Given an array of integers, rotate the array to the left by `D` positions. The rotation should be done in-place with O(1) space complexity (excluding the input array itself).

Input Format

 First line contains two integers `n` (1 ≤ n ≤ 10^5) and `D` (0 ≤ D ≤ 10^5), where `n` is the size of the array and `D` is the number of positions to rotate left.

 Second line contains `n` space-separated integers representing the array elements.

Output Format

 Print the rotated array with elements separated by spaces.


Constraints:
1 ≤ n ≤ 10^5

0 ≤ D ≤ 10^5

Array elements are integers with absolute value ≤ 10^9


Example:
Sample Input

5 2

1 2 3 4 5

Sample Output

3 4 5 1 2
*********************************************************************
Answer:
import java.util.*;
public class Main{
  public static void reverse(int arr[],int start,int end){
    while(start<end){
      int temp=arr[start];
      arr[start++]=arr[end];
      arr[end--]=temp;
    }
  }
  public static void leftrotate(int arr[],int d,int n){
    d=d%n;
    reverse(arr,0,d-1);
    reverse(arr,d,n-1);
    reverse(arr,0,n-1);
  }
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int d=s.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=s.nextInt();
    }
    leftrotate(arr,d,n);
    for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    }
  }
}

