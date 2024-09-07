import java.util.*;

public class Leetcode145 {

    static class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int[] nodes) {
            idx++;
            if (idx >= nodes.length || nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    public static List<Integer> postOrder(Node root) {
        List<Integer> list = new ArrayList<>();

        if (root == null) {
            return list;
        }

        list.addAll(postOrder(root.left));
        list.addAll(postOrder(root.right));
        list.add(root.val);

        return list;
    }

    public static void main(String[] args) {
        int[] nodes = {1,-1,3,2,4};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(postOrder(root));
    }
}
