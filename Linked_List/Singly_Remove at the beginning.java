/* .A singly linked list is a collection of nodes where each node contains data and a pointer to the next node.
This task is to delete the first (head) node of the linked list.

Input Format:

The first line contains an integer n — the number of elements in the list.
The second line contains n space-separated integers — the elements of the linked list.
Output Format:

Output the linked list after deleting the first node.
If the list becomes empty, print "List is empty".

Constraints:
NA


Example:
Sample Input:
4
10 20 30 40

Sample Output:
20 30 40 */
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
      if(head==null){
        System.out.print("List is empty");
      }
      else{
        if(head.next==null)System.out.print("List is empty");
        head=head.next;
      }
      Node current = head;
      while(current!=null){
        System.out.print(current.data+" ");
        current = current.next;
      }
    }
}
