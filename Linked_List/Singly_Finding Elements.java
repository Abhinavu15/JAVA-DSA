/* A singly linked list consists of nodes where each node contains some data and a pointer to the next node.
The task is to search for a given value in the linked list and return whether the value is present or not.

Input Format:

The first line contains an integer n — the number of elements in the linked list.
The second line contains n space-separated integers — the elements of the linked list.
The third line contains an integer key — the value to be searched in the list.
Output Format:

Output "Found" if the value is present in the list.
Output "Not Found" if the value is not present in the list.

Constraints:
NA


Example:
Sample Input:
5
10 20 30 40 50
30

Sample Output:
Found */

Answer:

import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    LinkedList l1 = new LinkedList();
    int n = s.nextInt();
    for(int i=0; i<n; i++){
      int num = s.nextInt();
      l1.create(num);
    }
    int target=s.nextInt();
    l1.search(target);
    
  }
}
class Node{
  int data;
  Node next;
  Node(int val){
    this.data = val;
    this.next = null;
  }
}
class LinkedList{
    Node head = null, current = null;
    void create(int n){
      Node newnode = new Node(n);
      if(head == null){
        head = newnode;
        current = newnode;
      }
      else{
        current.next = newnode;
        current = newnode;
      }
    }
    void search(int target){
      Node temp=head;
      while(temp!=null){
        if(temp.data == target){
          System.out.print("Found");
          return;
        }
        temp=temp.next;
      }
      System.out.print("Not Found");
    }
}
