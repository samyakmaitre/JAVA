public class leetcode108{

}

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(){}
    
    TreeNode(int val){
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }

}

class Solution{
    public TreeNode arrtobst(int[] nums){
        return buildbst(nums, 0, nums.length-1);
    }

    private TreeNode buildbst(int[] nums, int start, int end){
        //base case
        if(start>end){
            return null;
        }

        //work
        int mid = start + (end-start)/2;
        TreeNode root = new TreeNode(nums[mid]);

        //recurssion
        root.left = buildbst(nums, start, mid-1);
        root.right = buildbst(nums, mid+1, end);
        
        return root;
    }
}