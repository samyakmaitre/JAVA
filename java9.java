import java.util.Scanner;

public class java9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int c = 1;
        int sum = 0;
        while(c<=n){
            sum+=c;
            c++;
        }
        System.out.println(sum+"is the output");

        
        sc.close();
    }
}