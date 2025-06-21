import java.util.*;
public class Main {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }
    public static Node insert(Node root, int val) {
        if (root == null) return new Node(val);
        if (val < root.data) root.left = insert(root.left, val);
        else root.right = insert(root.right, val);
        return root;
    }
    public static int findMin(Node root) {
        while (root.left != null) root = root.left;
        return root.data;
    }
    public static int findMax(Node root) {
        while (root.right != null) root = root.right;
        return root.data;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node root = null;
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            root = insert(root, val);
        }
        System.out.println(findMin(root) + " " + findMax(root));
    }
}
