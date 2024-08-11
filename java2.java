import java.util.*;

public class java2 {
    public static void main(String args[]){
    Scanner scn = new Scanner(System.in);
    System.out.print("Number of pencil(5rs. each): ");
    int pencil = scn.nextInt();
    System.out.print("Number of pen(10rs. each): ");
    int pen = scn.nextInt();
    System.out.print("Number of eraser(3rs. each): ");
    int eraser = scn.nextInt();
    float amt = pencil*5+pen*10+eraser*3 ;
    float gst = (amt)*0.18f;
    System.out.println("Your amount is: "+amt+ " & gst of: "+ gst +"\nAmount to be paid is: "+(amt+gst));

    scn.close();
}

}
