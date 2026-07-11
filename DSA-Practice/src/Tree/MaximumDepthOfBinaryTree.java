package Tree;

public class MaximumDepthOfBinaryTree {
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) {
            this.val = val;
        }
    }
    public static int maxDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftdepth = maxDepth(root.left);
        int rightdepth = maxDepth(root.right);
        return 1 + Math.max(leftdepth, rightdepth);
    }

    public static void main(String[] args) {
//        TreeNode root1 = new TreeNode(1);
//        root1.left = new TreeNode(9);
//        root1.right = new TreeNode(20);
//        root1.right.left = new TreeNode(15);
//        root1.right.right = new TreeNode(7);
//
//        System.out.println("Test 1 (expect 1): " + maxDepth(root1));

        // Example 1: [3,9,20,null,null,15,7]
        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(9);
        root1.right = new TreeNode(20);
        root1.right.left = new TreeNode(15);
        root1.right.right = new TreeNode(7);
        System.out.println("Example 1 (expect 3): " + maxDepth(root1));

        // Example 2: [1,null,2]
        TreeNode root2 = new TreeNode(1);
        root2.right = new TreeNode(2);
        System.out.println("Example 2 (expect 2): " + maxDepth(root2));
    }
}


//Time- O (n) -Visits every node once
//Space- O(w) -Queue holds nodes at widest level, w = max width of tree