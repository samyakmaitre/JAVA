public class largest {
    public static void largest(int arr[]){
        int large = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        System.out.println(large);
        System.out.println(small);

        for(int i=0;i<arr.length; i++){
            if(arr[i]>large){
                large= arr[i];
            }
            if(arr[i]<small){
                small= arr[i];
            }
        }
        System.out.println("largest element is: "+large);
        System.out.println("smallest element is: "+small);
    }

    public static void main(String[] args) {
        int num[] = {2,4,6,1,15,9,10,13};
        largest(num);
    }
}
