import java.util.*;

public class leetcode401{

    public static List time(int n){
        List<String> result = new ArrayList<>();

        for(int hour =0; hour<12; hour++){
            for(int minute = 0; minute<60; minute++){
                if(Integer.bitCount(hour) + Integer.bitCount(minute) == n) {
                    result.add(String.format("%d:%02d",hour,minute));
                }
            }
        }
        return result;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(time(n));
    }
}