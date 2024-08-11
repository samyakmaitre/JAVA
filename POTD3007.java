import java.util.ArrayList;

public class POTD3007 {
    public static void main(String[] args){
        
    }
}

class Solution{
    //find path
    public ArrayList<String> findPath(int[][] mat){
        ArrayList<String> result = new ArrayList<>();
        if(mat[0][0]==0){
            return result;
        }
        int n = mat.length;
        boolean[][] visited = new boolean[n][n];
        findPaths(mat, 0, 0, n, null, visited, result);
    } 


    //find paths
    private void findPaths(int[][] mat, int i, int j, int n, String path, boolean[][] visited, ArrayList<String> result){

    }

}
