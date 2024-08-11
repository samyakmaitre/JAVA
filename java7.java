import java.util.*;

public class java7 {
    public static void main(String[] args) {
        System.out.println("Enter 1 for Monday");
        System.out.println("Enter 2 for Tuesday");
        System.out.println("Enter 3 for Wednesday");
        System.out.println("Enter 4 for Thursday");
        System.out.println("Enter 5 for Friday");
        System.out.println("Enter 6 for Saturday");
        System.out.println("Enter 7 for Sunday");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch (day) {
            case 1: System.out.println("Its Monday");
                
                break;
            case 2: System.out.println("Its Tuesday");
                
                break;
            case 3: System.out.println("Its Wednesday");
                
                break;
            case 4: System.out.println("Its Thursday");
                
                break;
            case 5: System.out.println("Its Friday");
                
                break;
            case 6: System.out.println("Its Saturday");
                
                break;
            case 7: System.out.println("Its Sunday");
                
                break;
        
            default:
                break;
        }
       
        
    sc.close();
    }
}
