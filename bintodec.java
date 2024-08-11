
public class bintodec {
    public static void main(String[] args) {

        System.out.println(bintodeci(101));

    }

    public static double bintodeci(double n) {
        double p = 0;
        double dec = 0;

        while (n>0){
        double ld = n % 10;
        dec = dec + (ld * Math.pow(2,p));
        n /= 10;
        }
        
        return dec;
    }

}
