/* In a singly linked list, each node contains data and a pointer to the next node.
This task is to delete the last node (tail) of the linked list.

Input Format:

The first line contains an integer n — the number of nodes in the linked list.
The second line contains n space-separated integers — the elements of the linked list
Output Format:

Output the list after deleting the last node.
If the list becomes empty, print "List is empty".

Constraints:
NA


Example:
Sample Input:
5
10 20 30 40 50

Sample output:
10 20 30 40 */

Answer:
import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    LinkedList l1 = new LinkedList();
    int n = s.nextInt();
    for(int i=0; i<n; i++){
      int num = s.nextInt();
      l1.create(num);
    }
    l1.deleteAtEnd();
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
    void deleteAtEnd(){
      if(head==null || head.next==null){
        head=null;
        System.out.print("List is empty");
        return;
      }
      Node temp = head;
      while (temp.next.next != null) {
        temp = temp.next;
      }
    temp.next = null;
    }
    void display(){
      Node current = head;
      while(current!=null){
        System.out.print(current.data+" ");
        current = current.next;
      }
    }
}
