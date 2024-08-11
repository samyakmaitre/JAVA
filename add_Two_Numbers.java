import java.util.*;

public class add_Two_Numbers{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter r for radius and d for diameter:");
        String a = scn.next();
        if(a.equals("r")){
            System.out.println("enter the radius:");
            float r = scn.nextFloat();
            double area = 3.14*(Math.pow(r,2));
            System.out.println("area is "+area);
        }
        else{
            System.out.println("enter the diameter:");
            int d = scn.nextInt();
            double are = 3.14*(Math.pow((d/2),2));
            System.out.println("area is "+are);
        }
        scn.close();
    }
}