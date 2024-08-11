import java.util.*;

public class binomial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Enter r: ");
        int r = sc.nextInt();
        float a = fact(n);
        float b = fact(r);
        float c = fact(n - r);

        float result = a / (b * c);

        System.out.println("Answer of " + n + "C" + r + " is: " + result);

        sc.close(); // Close the Scanner object

    }

    public static float fact(int m) {

        int fact = 1;

        for (int i = 1; i <= m; i++) {
            fact *= i;
        }

        return fact;
    }

}
