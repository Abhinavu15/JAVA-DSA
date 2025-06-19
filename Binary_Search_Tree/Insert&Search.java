import java.util.*;
public class Main {
    static class TreeNode {
        int data;
        TreeNode left, right;
        TreeNode(int val) {
            data = val;
            left = right = null;
        }
    }
    public static TreeNode insert(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        if (val < root.data) {
            root.left = insert(root.left, val);
        } else if (val > root.data) {
            root.right = insert(root.right, val);
        }
        return root;
    }
    public static boolean search(TreeNode root, int target) {
        if (root == null) return false;
        if (target == root.data) return true;
        if (target < root.data) return search(root.left, target);
        else return search(root.right, target);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeNode root = null;
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            root = insert(root, val);
        }
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();
            if (search(root, x)) {
                System.out.println("Found");
            } else {
                System.out.println("Not Found");
            }
        }
    }
}
