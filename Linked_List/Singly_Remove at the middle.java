/* In a singly linked list, each node contains data and a pointer to the next node.
This task is to delete the node in the middle of the linked list.

If the number of nodes is odd, delete the middle node (e.g., for 5 nodes, delete the 3rd).
If the number of nodes is even, delete the first middle (e.g., for 4 nodes, delete the 2nd)
Input Format:

The first line contains an integer n — the number of nodes in the list.
The second line contains n space-separated integers — the elements of the list.
Output Format:

Output the list after deleting the middle node.
If the list becomes empty, print "List is empty".

Constraints:
NA


Example:
Sample Input:
5
10 20 30 40 50
Sample Output:
10 20 40 50 */
Answer:

mport java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        MyLinkedList l1 = new MyLinkedList();
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            int num = s.nextInt();
            l1.create(num);
        }
        l1.deleteAtMiddle(n);
        l1.display();
    }
}
class Node {
    int data;
    Node next;
    Node(int val) {
        this.data = val;
        this.next = null;
    }
}
class MyLinkedList {
    Node head = null;
    Node tail = null;
    void create(int n) {
        Node newnode = new Node(n);
        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {
            tail.next = newnode;
            tail = newnode;
        }
    }
    void deleteAtMiddle(int n) {
        if(head==null)
          System.out.print("List is empty");
        else{
          if(head.next == null){
            System.out.print("List is empty");
            head = head.next; 
            return;
          }
          int mid = (n%2==0)? (n/2-1):(n/2);
          Node temp = head;
          for (int i = 0; i < mid - 1; i++) {
            temp = temp.next;
          }
          temp.next = temp.next.next;
        }
    }
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
