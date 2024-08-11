
import java.util.*;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int s=0;
        for(int i=n;i!=0;i/=10){
            int digit = i%10;
            s+=Math.pow(digit,3);

        }
        if(s==n)
        {
            System.out.println("ARMSTRONG NO");
        }
        else
        {
            System.out.println("NOT");

        }

        sc.close();
    }
}


// class Solution {

//     String compareFrac(String str)
//     {
//         String[] fs = str.split(", ");
        
//         // Parse the fs into numerators and denominators
//         String[] fn1 = fs[0].split("/");
//         String[] fn2 = fs[1].split("/");
        
//         int n1 = Integer.parseInt(fn1[0]);
//         int d1 = Integer.parseInt(fn1[1]);
        
//         int n2 = Integer.parseInt(fn2[0]);
//         int d2 = Integer.parseInt(fn2[1]);
        
//         // Compare fs by cross-multiplying to avoid division
//         if (n1 * d2 > n2 * d1) {
//             return fs[0];
//         }
//         else if (n1 * d2 < n2 * d1) {
//             return fs[1];
//         }
//         else {
//             return "equal";
//         }
//     }
// }
