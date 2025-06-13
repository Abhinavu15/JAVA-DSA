/* A singly linked list is a sequence of nodes where each node contains some data and a pointer to the next node.
In this task, you're required to insert a new node at the end of the linked list.
Input Format:
The first line contains an integer n — the number of elements currently in the list.
The second line contains n space-separated integers — the elements of the linked list.
The third line contains an integer x — the value to insert at the end.
Output Format:
Output the linked list after inserting the new node at the end.
Print all elements in a single line, separated by spaces.
Constraints:
NA
Example:
Sample Input:
4
1 2 3 4
99
Sample Output:
1 2 3 4 99 */
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
    int n1=s.nextInt();
    l1.create(n1);
    l1.display();
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
    void display(){
      Node current = head;
      while(current!=null){
        System.out.print(current.data+" ");
        current = current.next;
      }
    }
}
