import java.util.*;

public class minimizeTheHeight {
    public static int getMinDiff(int[] arr, int k){

        int n = arr.length;
        if(n==1){
            return 0;
        }

        Arrays.sort(arr);

        int diff = arr[n-1] - arr[0];

        int smallest = arr[0] + k;
        int largest = arr[n-1] - k;

        for(int i = 0; i<n-1; i++){
            int minVal = Math.min(smallest, arr[i+1]+k);
            int maxVal = Math.max(largest, arr[i] + k);

            if(minVal < 0) continue;

            diff = Math.min(diff, maxVal-minVal);
        }

        return diff;

    } 
    public static void main(String[] args){
        int[] arr = {1,5,8,10};
        int k = 2;
        System.out.println(getMinDiff(arr, k));
    }
}
