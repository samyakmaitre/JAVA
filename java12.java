import java.util.*;
public class java12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev = 0;
        while (num>0){
            int l = num%10;
            rev = rev*10+l;
            
            num = num/10;
        }
        System.out.print(rev);
    }
}