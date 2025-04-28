public class PreorderTraversal {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static void preorder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10); 
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        System.out.println("Preorder traversal: ");
        preorder(root); 
    }
}
