public class PostOrderTraversal {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static void postorder(TreeNode root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10); 
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        System.out.println("Post order traversal: ");
        postorder(root); 
    }
}
