import java.util.*;

public class singlenumber {
    public static void single(int arr[]){
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            for(int j= i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    continue;
                }
                else{
                    System.out.println(arr[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int num[] = {2,2,1};
        single(num);
    }
}
