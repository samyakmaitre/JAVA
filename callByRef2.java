import java.util.*;

public class callByRef2 {
    public static void main(String[] args){
        int num = 10;
        modify(num);
        System.out.println(num + "from main");
    }

    public static void modify(int num){
        num = 20;
        System.out.println(num + "from function");
    }
}
