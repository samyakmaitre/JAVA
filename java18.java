import java.util.*;

public class java18 {


    // public static int printhw(int a, int b) {
    //     int sum = a + b ;
    //     return sum;
    // }

    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     int x = sc.nextInt();
    //     int y = sc.nextInt();
    //     printhw(x, y);
        

    public static int printhw(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int result = printhw(x, y);
        System.out.println("The sum is: " + result);
    }


    }
