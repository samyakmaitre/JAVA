public class BinaryTrees {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        private static int idx = -1; // Managing index as a class-level variable

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

        public static void preOrder(Node root){
            if(root == null){
                return;
            }

            System.out.println(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);

        }

        public static void inOrder(Node root){
            if(root == null){
                return;
            }
            inOrder(root.left);
            System.out.println(root.data + " ");
            inOrder(root.right);
        }

        public static void postOrder(Node root){
            if(root == null){
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.data + " ");
        }
    }
    

    public static void main(String[] args) {
        int[] nodes = {1, 2, 3, -1, -1, 4, -1, -1, 5, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println("Binary Tree constructed successfully.");
    }
}
