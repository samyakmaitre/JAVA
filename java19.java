import java.util.*;

public class java19 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int totalSum = (N * (N + 1)) / 2;
        int arraySum = 0;

        int missingElement = totalSum - arraySum;
        System.out.println("Missing element: " + missingElement);
    }
}
