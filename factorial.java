public class factorial{
    public static void main(String[] args){
        System.out.println(fact(5));
    }

    public static int fact(int n){
        int fact = 1;
        for(int i=1; i<=n ; i++){
            fact *= i;
        }

        return fact;
    }
}