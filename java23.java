import java.util.Scanner;

public class java23 {

    public static void swap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a is: "+a+"  b is: "+b);
    }

    public static void main(String[] args) {
        swap();
    }
}
