public class CountLeafNodes {
    public static class TreeNode {
        TreeNode left; 
        TreeNode right;
        int data; 

        TreeNode(int data) {
            this.data = data; 
        }
    }

    private static int totalLeafNodes(TreeNode root) {
        if (root == null) return 0; 
        if (root.left == null && root.right == null) {
            return 1; 
        }
        return totalLeafNodes(root.left) + totalLeafNodes(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10); 
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(40);
        root.left.right = new TreeNode(50);

        System.out.println("Total leaf nodes: " + totalLeafNodes(root));
    }
}
