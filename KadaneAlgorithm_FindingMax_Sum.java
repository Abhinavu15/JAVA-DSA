ou are given an array of integers. Your task is to find the maximum sum of any contiguous subarray using Kadane’s Algorithm. This problem focuses on efficient handling of large arrays and is a classic in dynamic programming. A contiguous subarray is a part of the array formed by consecutive elements. Kadane's Algorithm efficiently finds the maximum sum by keeping track of the current subarray sum and updating the global maximum when a better sum is found. The algorithm runs in linear time and works even if the array contains all negative numbers. Print the maximum subarray sum at the end. This is useful in many real-world applications such as financial analysis and signal processing.

Input Format:
The first line contains an integer n — size of the array.
The next line contains n space-separated integers.

Output Format:
Print a single integer — the maximum subarray sum.




***********************************************************************************

Answer:

import java.util.*;
public class Kadane{
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=s.nextInt();
    }
    int maxsum=arr[0],currentsum=arr[0];
    for(int i=1;i<n;i++){
      currentsum = Math.max(arr[i],currentsum+arr[i]);
      maxsum = Math.max(currentsum,maxsum);
    }
    System.out.print(maxsum);
  }
}
