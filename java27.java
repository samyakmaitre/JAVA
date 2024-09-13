
public class java27{
    public static void BinToDec(int n){
        int pow = 0;
        double dec = 0;
        while(n>0){

            int ld = n%10;
            dec += ld * Math.pow(2,pow);
            n /= 10;
            pow++;

        }
        System.out.println(dec);
    }
        public static void DecToBin(int n) {
            int bin = 0;
            int pow = 0;
            while (n > 0) {
                int digit = n % 2;
                bin += digit * Math.pow(10, pow);
                n = n / 2;
                pow++;
            }
            System.out.println(bin);
        }
    
        public static void main(String[] args) {
            DecToBin(5);
        }
    }
    



