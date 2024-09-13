import java.util.*;

class Solution{
    public String fractionOperation(String expression){
        int numerator = 0;
        int denominator = 1;
        int i =0;
        int n = expression.length();

        while(i<n){
            //read the sign
            int sign = 1;
            if(expression.charAt(i) == '-' || expression.charAt(i) == '+'){
                sign = (expression.charAt(i) == '-') ? -1 : 1;
                i++;
            }

            //read the numerator
            int num = 0;
            while (i<n && Character.isDigit(expression.charAt(i))){
                num = num * 10 + (expression.charAt(i) - '0');
                i++;
            }
            num *= sign;

            i++;

            int denom = 0;
            while(i<n && Character.isDigit(expression));
        }
    }
}