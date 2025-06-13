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
public class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        MyLinkedList l1 = new MyLinkedList();
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            int num = s.nextInt();
            l1.create(num);
        }
        int n1 = s.nextInt();
        l1.insertAtMiddle(n1, n);
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
    void insertAtMiddle(int val, int n) {
        Node newnode = new Node(val);
        if (head == null) {
            head = newnode;
            return;
        }
        int mid = n / 2;
        Node temp = head;
        if (n == 1) {
            newnode.next = temp.next;
            temp.next = newnode;
            return;
        }
        for (int i = 0; i < mid - 1; i++) {
            temp = temp.next;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
