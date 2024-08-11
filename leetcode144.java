import java.util.ArrayList;
import java.util.List;

public class leetcode144 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) {this.val = val;}
        TreeNode(int val, TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        public List<Integer> preorderTraversal(TreeNode root){
            List<Integer> result = new ArrayList<>();
            preorderHelper(root, result);
            return result;
        }
        private void preorderHelper(TreeNode node, List<Integer> result){
            if(node == null){
                return;
            }
            result.add(node.val);
            preorderHelper(node.left, result);
            preorderHelper(node.right, result);
        }
    }

    public static void main(String[] args) {
        leetcode144 outer = new leetcode144();
        Solution sol = outer.new Solution();
        
        // Creating a sample binary tree:
        //      1
        //     / \
        //    2   3
        //   / \
        //  4   5
        
        TreeNode root = outer.new TreeNode(1);
        root.left = outer.new TreeNode(2);
        root.right = outer.new TreeNode(3);
        root.left.left = outer.new TreeNode(4);
        root.left.right = outer.new TreeNode(5);
        
        // Testing the preorderTraversal method
        List<Integer> result = sol.preorderTraversal(root);
        
        // Printing the result
        System.out.println(result); // Expected output: [1, 2, 4, 5, 3]
    }
}
