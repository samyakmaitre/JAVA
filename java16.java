import java.util.*;

public class java16 {

    public static int calculatesum(int i, int j){
        int sum = i+j;
                
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int summ = calculatesum(a,b);
        System.out.println(summ);
        sc.close();
    }
}