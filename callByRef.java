import java.util.*;

public class callByRef {
    public static void main(String[] args){
        int[] arr = {10};
        modify(arr);
        System.out.println(arr[0] + "from main");
    }

    public static void modify(int[] arr){
        arr[0] = 20;
        System.out.println(arr[0] + "from function");
    }
}
