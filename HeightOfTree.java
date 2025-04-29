public class HeightOfTree {
    public static class TreeNode {
        TreeNode left; 
        TreeNode right;
        int data; 

        TreeNode(int data) {
            this.data = data; 
        }
    }

    private static int height(TreeNode root) {
        if (root == null) return 0; 
        
        int left = height(root.left);
        int right = height(root.right);

        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10); 
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(40);
        root.left.right = new TreeNode(50);

        System.out.println("Height of the tree: " + height(root));
    }
}
