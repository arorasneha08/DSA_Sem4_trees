public class SearchNodeInBinaryTree {
    public static class TreeNode {
        TreeNode left; 
        TreeNode right;
        int data; 

        TreeNode(int data) {
            this.data = data; 
        }
    }

    private static boolean searchNode(TreeNode root, int target) {
        if (root == null) return false;

        if (root.data == target) return true;

        boolean leftSearch = searchNode(root.left, target);
        boolean rightSearch = searchNode(root.right, target);

        return leftSearch || rightSearch;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10); 
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(40);
        root.left.right = new TreeNode(50);

        int target = 40;
        if(searchNode(root, target)){
            System.out.println("target found");
        }
        else{
            System.out.println("target not found");
        }
    }
}
