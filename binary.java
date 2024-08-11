public class binary{
    public static void binary(int[] arr, int key){
        int si = 0;
        int ei = arr.length-1;

        while(si <= ei){
            int mid = si + (ei - si)/2;
            if(arr[mid]==key){
                System.out.println("index is "+ mid);
                return;
            }

            if(arr[mid]<key){
                si = mid+1;
            }
            if(arr[mid]>key){
                ei = mid-1;
            }
        }
        System.out.println("not found");
    }
    public static void main(String[] args){
        int arr[] = {2, 4, 6, 8, 10, 12};
        binary(arr, 11);

    }
}