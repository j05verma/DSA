package Tree;

public class SameTree {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }
        if(p == null || q == null){
            return false;
        }
        if(p.val != q.val){
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
    public static void main(String[] args){
        // Test 1: identical trees
        TreeNode p1 = new TreeNode(1);
        p1.left = new TreeNode(2);
        p1.right = new TreeNode(3);

        TreeNode q1 = new TreeNode(1);
        q1.left = new TreeNode(2);
        q1.right = new TreeNode(3);

        System.out.println("Test 1 (expect true): " + isSameTree(p1, q1));

        // Test 2: different structure (left vs right child)
        TreeNode p2 = new TreeNode(1);
        p2.left = new TreeNode(2);

        TreeNode q2 = new TreeNode(1);
        q2.right = new TreeNode(2);

        System.out.println("Test 2 (expect false): " + isSameTree(p2, q2));

        // Test 3: same structure, different values
        TreeNode p3 = new TreeNode(1);
        p3.left = new TreeNode(2);
        p3.right = new TreeNode(1);

        TreeNode q3 = new TreeNode(1);
        q3.left = new TreeNode(1);
        q3.right = new TreeNode(2);

        System.out.println("Test 3 (expect false): " + isSameTree(p3, q3));
    }
}


/*
Time- O(n)                  Visits every node in both trees once
Space- O(h)          Recursion call stack, h = height of smaller tree
 */