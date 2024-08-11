public class floyd {

    public static void floyds(int r){
        int count = 1;
        for(int row=1; row<=r; row++) {
            for(int j=1; j<=count; j++){
                System.out.println(count);
                count--;
            }
            
        }

    }

    public static void main(String[] args) {
        floyds(5);
    }
}
