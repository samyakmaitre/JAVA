import java.util.*;

public class java26 {
    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to convert binary to decimal
    public static int binToDec(int n) {
        int num = n;
        int decValue = 0;
        int base = 1;
        
        while (num > 0) {
            int lastDigit = num % 10;
            num = num / 10;
            decValue += lastDigit * base;
            base = base * 2;
        }
        return decValue;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prime number check
        System.out.println("Enter a number to check if it is prime:");
        int a = sc.nextInt();
        if (isPrime(a)) {
            System.out.println("It's prime");
        } else {
            System.out.println("Not prime");
        }
        
        // Binary to decimal conversion
        System.out.println("Enter a binary number to convert to decimal:");
        int b = sc.nextInt();
        System.out.println("Decimal value: " + binToDec(b));
        
        sc.close();
    }
}
