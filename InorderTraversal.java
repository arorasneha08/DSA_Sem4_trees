public class InorderTraversal {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10); 
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        System.out.println("inorder traversal: ");
        inorder(root); 
    }
}