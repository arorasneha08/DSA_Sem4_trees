import java.util.LinkedList;
import java.util.Queue;

public class InsertNodeInBinaryTree {
    public static class TreeNode {
        TreeNode left;
        TreeNode right;
        int data;

        TreeNode(int data) {
            this.data = data;
        }
    }

    private static TreeNode insert(TreeNode root, int value) {
        TreeNode newNode = new TreeNode(value);

        if (root == null) {
            return newNode;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            TreeNode curr = q.poll();

            if (curr.left == null) {
                curr.left = newNode;
                break;
            } else {
                q.add(curr.left);
            }

            if (curr.right == null) {
                curr.right = newNode;
                break;
            } else {
                q.add(curr.right);
            }
        }
        return root;
    }

    private static void inorder(TreeNode root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(40);

        System.out.print("Before insertion : ");
        inorder(root);
        System.out.println();

        root = insert(root, 50);

        System.out.print("After insertion : ");
        inorder(root);
    }
}
