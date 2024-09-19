import java.util.*;

public class minimizeTheHeight{
    public static int getMinHeight(int[] arr, int k){
        int n = arr.length;
        if(n == 1){
            return 0;
        }
        Arrays.sort(arr);

        int largest = arr[n-1] - k;
        int smallest = arr[0] + k;

        int diff  = arr[n-1] - arr[0];

        for(int i = 0; i<n-1 ; i++){
            int min = Math.min(smallest, arr[i+1] - k);
            int max = Math.max(largest, arr[i] + k);
            
            if (min < 0) continue;

            diff = Math.min(diff, max-min);
        }


        return diff;

    }
    public static void main(String[] args){
        int[] arr = {1, 5, 8, 10};
        int k = 2;
        System.out.println(getMinHeight(arr, k));
    }
}