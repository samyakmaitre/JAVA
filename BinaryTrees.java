import java.util.*;
import java.util.LinkedList;

public class BinaryTrees{

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int[] nodes){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    public static void postOrder(Node root){
        if(root == null){
            return;
        }
        System.out.println(root.data+ " ");
        postOrder(root.left);
        postOrder(root.right);
    }

    public static void inOrder(Node root){
        inOrder(root.left);
        System.out.println(root + " ");
        inOrder(root.right);
    }

    public static void lvlOrder(Node root){
        if(root == null){
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            Node currentNode = queue.poll();
            System.out.print(currentNode.data + " ");

            if(currentNode.left != null){
                queue.offer(currentNode.left);
            }

            if(currentNode.right != null){
                queue.offer(currentNode.right);
            }
        }
    }
    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
    
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
    
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static int count(Node root){
        if(root==null){
            return 0;
        }

        int count  = 1 + count(root.left) + count(root.right);

        return count;
    }

    public static int sum(Node root){
        if(root==null){
            return 0;
        }

        int sum  = root.data + sum(root.left) + sum(root.right);

        return sum;
    }

    public static int diameter(Node root) {
        if(root == null){
            return 0;
        }

        int leftDiam = diameter(root.left);
        int rightDiam = diameter(root.right);
        int leftHt = height(root.left);
        int rightHt = height(root.right);

        int selfDiam = leftHt + rightHt + 1;

        return Math.max(selfDiam, Math.max(leftDiam, rightDiam));
    }

    public static class Info{
        int diam;
        int ht;

        Info(int diam, int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }

    public static Info diameter2(Node root){
        if(root == null){
            return new Info(0,0);
        }

        Info lInfo = diameter2(root.left);
        Info rInfo = diameter2(root.right);

        int diam = Math.max(Math.max(lInfo.diam, rInfo.diam), lInfo.ht + rInfo.ht + 1 );
        int ht = Math.max(lInfo.ht , rInfo.ht) +1;

        return new Info(diam, ht);
        
    }


    public static boolean isIdentical(Node node, Node subRoot){
        if(node == null && subRoot == null){
            return true;
        }else if(node==null || subRoot == null || node.data != subRoot.data){
            return false;
        }

        if(!isIdentical(node.left, subRoot.left)){
            return false;
        }
        if(!isIdentical(node.right, subRoot.right)){
            return false;
        }
        return true;
    }

    public static boolean isSubtree(Node root, Node subRoot){
        if(root==null){
            return false;
        }
        if(root.data == subRoot.data){
            if(isIdentical(root, subRoot)){
                return true;
            }
        }
        return isSubtree(root, subRoot) || isSubtree(root, subRoot);    }

    public static void main(String[] args){
        // int[] nodes = {1, 2, 4, -1, -1, -1, 3, 5, -1, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        // Node root = tree.buildTree(nodes);

        //       1
        //      / \
        //     2   3
        //    /   / \
        //   4   5   6 

        // lvlOrder(root);
        // System.out.println();
        // System.out.println(diameter(root));
        // System.out.println(diameter2(root).diam);

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

    //      1
    //     / \
    //    2   3
    //   / \ / \
    //  4  5 6  7
     

        // Create the subtree
        Node subTree = new Node(2);
        subTree.left = new Node(4);
        subTree.right = new Node(5);

    //      2
    //     / \
    //    4   5
       
    }
}