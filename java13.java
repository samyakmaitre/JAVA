import java.util.*;
public class java13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("enter a number:");
            int num = sc.nextInt();
            if(num%10==0){
                break;
            }
            System.out.println(num);
        }
    }
}