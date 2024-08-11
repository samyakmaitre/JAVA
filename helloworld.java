import java.util.*;

public class helloworld {
    

    public static void my() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int myNum = scan.nextInt();
        System.out.println(myNum + " Yes, that's it");
        scan.close();
    }
}
