import java.util.*;

class hellojava {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++){
            
            try{
                long x = sc.nextLong();
                System.out.println(x + "can be fitted in:");

                if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE)
                System.out.println("it a byte");

                if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE)
                System.out.println("its a short");

                if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE);
                System.out.println("its a long");

                if(x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE);
                System.out.println("its a integer");

            }
            catch(Exception e) {
                System.out.println(sc.next() + "Cant be fitted anywhere.");
            }
            sc.close();

        }
    }
}