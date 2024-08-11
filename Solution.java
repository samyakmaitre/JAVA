import java.util.*;
import java.util.ArrayList;
import java.util.List;


class Solution{
    static List<Long> jugglerSequence(long n) {
        List<Long> sequence = new ArrayList<>();
        sequence.add(n);
        while(n>1){
            if (n%2==0){
                if(n%2==0){
                    n = (long) Math.pow(n, 0.5);                   
                } else{
                    n = (long) Math.pow(n, 1.5);
                }
            }
        }
    }
}