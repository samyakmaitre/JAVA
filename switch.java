import java.util.*;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Enter the operator: ");
        char c = sc.next().charAt(0);

        switch (c) {
            case '+' :
                System.out.println("Result: " + (a + b));
                break;
            case '-' :
                System.out.println("Result: " + (a - b));
                break;
            case '*' :
                System.out.println("Result: " + (a * b));
                break;
            case '/' :
                if (b != 0) {
                    System.out.println("Result: " + (a / b));
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid operator");
        }
        
        sc.close();
    }
}
