import java.util.*;

class Node{
    int data;
    Node left;
    Node right;

}

class Tree { 
    ArrayList<Integer> leftView(Node root){
        ArrayList<Integer> result = new ArrayList<>();
        if(root == null) return result;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int n = queue.size();

            for(int i=0; i<n; i++){
                Node currentNode = queue.poll();

                if(i==0){
                    result.add(currentNode.data);
                }

                if(currentNode.left != null){
                    queue.add(currentNode.left);
                }

                if(currentNode.right != null){
                    queue.add(currentNode.right);
                }
            }
        }
        return result;
    }
}