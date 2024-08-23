import java.util.*;

public class BinaryTrees2{

    static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int[] nodes){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    //preOrder
    public static void preOrder(Node root){
        if(root == null){
            return;
        }

        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

    //inOrder
    public static void inOrder(Node root){
        if(root == null){
            return;
        }

        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }

    //postOrder
    public static void postOrder(Node root){
        if(root == null){
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }

    //height
    public static int height(Node root){

        //base case
        if(root == null){
            return 0;
        }

        //recursion
        int lh = height(root.left);
        int rh = height(root.right);

        //kaam
        return Math.max(lh,rh) + 1;
    }

    //no. of nodes
    public static int count(Node root){
        if(root==null){
            return 0;
        }

        int leftCount = count(root.left);
        int rightCount = count(root.right);
        
        return leftCount+rightCount+1;
    }

    // sum of nodes
    public static int sum(Node root){
        if (root == null){
            return 0;
        }

        int leftData = sum(root.left);
        int rightData = sum(root.right);

        return leftData + rightData + root.data; // Include the root data in the sum
    }
 

    public static void main(String[] args){

        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(sum(root));

    }

}