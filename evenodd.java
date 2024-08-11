import java.util.*;

public class evenodd {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); 
        System.out.println((a % 2 == 0) ? "Even" : "Odd");
        sc.close();
    }
}
