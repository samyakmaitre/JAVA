public class linearcopy{

    // public static void linear(int[] arr, int key){
    //     for(int i=0; i<arr.length; i++){
    //         if(arr[i]==key){
    //             System.out.println(i);
    //             return;
    //         }
    //     }
    //     System.out.println("Not found");
    // }

    // public static void main(String[] args){
    //     int[] myarr = {2, 4, 6, 8, 10, 12};
    //     linear(myarr, 6);
    // }
/////////////////////////////////////////////////////////
    // public static void rev(int[] arr){
    //     int[] newArr = new int[arr.length];
    //     for(int i=0; i<arr.length ; i++){
    //         newArr[i] = arr[arr.length-1-i];
    //     }
    //     for(int i=0; i<arr.length ; i++){
    //         System.out.print(newArr[i] + " ");
    //     }
    // }
    // public static void main(String[] args){
    //     int[] myArr = {2, 4, 6, 8, 10, 12};
    //     rev(myArr);
    // }
////////////////////////////////////////////////////////
    //swap first and last

    // public static void rev(int[] arr){
    //     int si = 0;
    //     int ei = arr.length-1;

    //     while(si<=ei){
    //         int temp = arr[si];
    //         arr[si] = arr[ei];
    //         arr[ei] = temp;
    //         si++; ei--;
    //     }

    //     for(int i=0; i<arr.length ; i++){
    //         System.out.print(arr[i] + " ");
    //     }
    // }
    // public static void main(String[] args){
    //     int[] myArr = {2, 4, 6, 8, 10, 12};
    //     rev(myArr);
    // }

    ///////////////////////////////////////////////////
    //PAIRS IN AN ARRAY
    // public static void pair(int[] arr){
    //     for(int i=0; i<arr.length; i++){
    //         for(int j=i; j<arr.length; j++){
    //             for(int k=i; k<=j; k++){
    //                 System.out.print(arr[k]+",");
    //             }
    //             System.out.print(" ");
    //         }
    //         System.out.println();
    //     }
    // }
    // public static void main(String[] args){
    //     int[] myarr = {2, 4, 6, 8, 10};
    //     pair(myarr);
    // }
////////////////////////////////////////////////////////
//max sum

    public static void maxSum(int[] arr){
        // int cs = 0;
        int ms = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<0){
                continue;
            }
            ms=ms+arr[i];
        }
        System.out.println(ms);
    }
    public static void main(String[] args){
        int array[] = {-2, -3, 4,-1,-2,1,5,-3};
        maxSum(array);
    }

}