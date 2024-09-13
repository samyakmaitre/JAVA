import java.util.*;

public class leetcode1310 {

    public static void xorQueries(int[] arr, int[][] queries) {
        int n = arr.length;
        int[] prefixXOR = new int[n];
        
        // Initialize the first element of prefixXOR to arr[0]
        prefixXOR[0] = arr[0];
        
        // Calculate the prefix XOR array
        for (int i = 1; i < n; i++) {
            prefixXOR[i] = prefixXOR[i - 1] ^ arr[i];
        }

        int m = queries.length;
        int[] result = new int[m];

        // Process each query
        for (int i = 0; i < m; i++) {
            int left = queries[i][0];
            int right = queries[i][1];

            // If left is 0, we don't need to XOR with prefixXOR[left - 1]
            if (left == 0) {
                result[i] = prefixXOR[right];
            } else {
                result[i] = prefixXOR[right] ^ prefixXOR[left - 1];
            }
        }

        // Print the result array
        for (int x : result) {
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 8};
        int[][] queries = {{0, 1}, {1, 2}, {0, 3}, {3, 3}};
        xorQueries(arr, queries);  // Output: 2 7 14 8
    }
}
