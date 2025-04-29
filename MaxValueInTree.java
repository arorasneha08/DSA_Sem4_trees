public class MaxValueInTree {
    public static class TreeNode {
        TreeNode left; 
        TreeNode right;
        int data; 

        TreeNode(int data) {
            this.data = data; 
        }
    }

    private static int maxNode(TreeNode root) {
        if (root == null) return Integer.MIN_VALUE; 

        int leftMax = maxNode(root.left);
        int rightMax = maxNode(root.right);

        return Math.max(root.data, Math.max(leftMax, rightMax));
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10); 
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(40);
        root.left.right = new TreeNode(50);

        System.out.println("Max value : " + maxNode(root));
    }
}
