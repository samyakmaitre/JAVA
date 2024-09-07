import java.util.*;

public class nthNaturalNumber{
    public static long findNth(long n){
        long result = 0;
        long multiplier = 1;

        while(n>0){
            long remainder = n%9;
            result += remainder * multiplier;
            multiplier *= 10;
            n /= 9;
        }

        return result;
    }

    public static void main(String[] args){
        long n = 13;
        System.out.println(findNth(n));
    }
}