public class TotalNodesInTree {

    public static class TreeNode {
        TreeNode left; 
        TreeNode right;
        int data; 

        TreeNode(int data) {
            this.data = data; 
        }
    }

    private static int countNodes(TreeNode root) {
        if (root == null) return 0;
        return countNodes(root.left) + countNodes(root.right) + 1; 
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10); 
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        System.out.println("total nodes : " + countNodes(root));
    }
}
