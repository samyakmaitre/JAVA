import java.util.*;

public class java15 {
    public static void main(String[] args) {
        
        String n = "ABCDEFGHIJ";
        
        for(int i = 1 ; i<=4 ; i++){
            for(int j = 0 ; j<=10 ; j++){
                System.out.print(n.charAt(j));
            }
            System.out.println();
        }
    }
}