import java.util.*;

public class leetcode67{

    public static String sum(String a , String b){
        StringBuilder result = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;

        while(i>=0 || j>=0){
            int sum = carry;
            if(i>=0){
                sum += a.charAt(i) - '0';
                i--;
            }
            if(j>=0){
                sum += b.charAt(j) - '0';
                j--;
            }
            result.append(sum%2);
            carry = sum/2;
        }
        if(carry != 0){
            result.append(carry);
        }

        return result.reverse().toString();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        System.out.println(sum(a, b));
    }
}