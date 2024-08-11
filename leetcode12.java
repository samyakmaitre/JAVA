import java.util.*;

public class leetcode12{

    
    final static int[] val = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    final static String[] rom = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

    public static String intToRoman(int N){
        StringBuilder sb = new StringBuilder();

        for(int i =0; N>0; i++){
            while(N>=val[i]){
                sb.append(rom[i]);
                N = N-val[i];
            }
        }
        return sb.toString();
    }

    public static void main(String[] args){
        int a = 37;
        System.out.println(intToRoman(a));
    }
}