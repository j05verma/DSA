package Tree;

import java.util.*;

/*
      Input: root = [3,9,20,null,null,15,7]
      Output: [[3],[9,20],[15,7]]
 */
public class BinaryTreeLevelOrderTraversal {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    public static List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>();
            for(int i =0; i < levelSize; i++){
                TreeNode current = queue.poll();
                currentLevel.add(current.val);

                if(current.left != null) queue.add(current.left);
                if(current.right != null) queue.add(current.right);
            }
            result.add(currentLevel);
        }
        return result;
    }

    public static void main(String[] args) {
        // root [3,9,20,null,null,15,7]
        TreeNode n = new TreeNode(3);
        n.left = new TreeNode(9);
        n.right = new TreeNode(20);
        n.right.left = new TreeNode(15);
        n.right.right = new TreeNode(7);

        //levelOrder(n);
        System.out.println(levelOrder(n));
    }
}

// Time - O(n)
// Space - O(n)