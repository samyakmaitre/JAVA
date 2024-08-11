public class rev {
    public static void reverse(int arr[])
    {
        int first = 0;
        int last = arr.length-1;

        while(first<last){
            arr[first] += arr[last];
            arr[last] = arr[first] - arr[last];
            arr[first] -= arr[last];

            last--;
            first++;
        }
    }

    public static void main(String[] args) {
        int num[] = {0,87,69,12,37,94,64};
        reverse(num);

        for (int i=0; i<num.length; i++){
            System.out.println(num[i]);
        }
    }
}
