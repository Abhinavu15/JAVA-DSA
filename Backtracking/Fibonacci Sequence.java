/*In a system where each decision is tracked and backtracked for analysis, a recursive solution using backtracking is required to generate the first n terms of the Fibonacci series. Unlike typical recursion, your function should use backtracking principles, meaning it should explore all possible recursive calls and undo changes (backtrack) to maintain a clean state before returning.

You must implement a function to generate the Fibonacci sequence up to n terms using backtracking logic.

Input Format:
A single integer n — the number of terms in the Fibonacci series to generate.

Output Format:
A single line with n space-separated integers representing the Fibonacci sequence.*/

Answer:

import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int res = fib(n);
    System.out.print(res);
  }
  public static int fib(int n){
    if(n==1) return 0;
    if(n==2) return 1;
    else return fib(n-1)+fib(n-2);
  }
}
