import java.util.*;

public class reverseWords {

    public static void reverseWords(String str){
        String[] arr = str.split("\\.");
        String sb = arr[arr.length-1];

        for(int i = 0; i<arr.length-2; i--){
            sb = sb + arr[i];
        };
        System.out.println(sb);
    }

    public static void main(String args[]){
        String s = "my.name.is.khan";
        reverseWords(s);
    }
}
