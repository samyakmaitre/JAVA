public class subarray{
    public static void getsubarray(int[] numbers){
        for(int i=0;i<numbers.length;i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                for(int k = start; k<numbers.length; k++ ){
                    System.out.println(numbers[k]+" ");
                }
            }System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        getsubarray(arr);
    }
}