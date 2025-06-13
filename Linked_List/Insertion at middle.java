/*A singly linked list is a linear data structure where each node contains a data field and a pointer to the next node.
This task is to insert a new node in the middle of the linked list.

If the number of nodes is even, insert the new node after the first middle (e.g., in a 4-element list, insert at position 2).
If the number of nodes is odd, insert the new node exactly in the middle (e.g., in a 5-element list, insert at position 2).
Input Format:

The first line contains an integer n — the number of elements currently in the list.
The second line contains n space-separated integers — the elements of the linked list.
The third line contains an integer x — the value to insert in the middle.
Output Format:

Output the linked list after inserting the new node in the middle.
Print all elements in a single line separated by spaces.

Constraints:
NA


Example:
Sample Input:
4
1 2 3 4
99
Sample output:
1 2 99 3 4 */
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
    int n1 = s.nextInt();
    l1.insertAtMiddle(n1,n);
    l1.display();
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
    void insertAtMiddle(int val, int n){
      Node newnode = new Node(val);
      if(head == null){
        head = newnode;
        current = newnode;
      }
      int mid = n/2;
      Node current = head;
      int i=0;
      while(i<mid-1){
        i++;
        current = current.next;
      }
      newnode.next = current.next;
      current.next = newnode;
    }
    void display(){
      Node current = head;
      while(current!=null){
        System.out.print(current.data+" ");
        current = current.next;
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
}
