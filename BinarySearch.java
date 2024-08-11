public class BinarySearch {
    public static void binarySearch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2; // calculate mid inside the loop
            
            // if key is found
            if (arr[mid] == key) {
                System.out.println("Element found at index: " + mid);
                return;
            }
            
            // if key is greater, ignore left half
            if (arr[mid] < key) {
                start = mid + 1;
            } 
            // if key is smaller, ignore right half
            else {
                end = mid - 1;
            }
        }
        
        // key not found
        System.out.println("Element not found in the array.");
    }

    public static void main(String[] args) {
        int array[] = {2, 4, 6, 8, 10, 12};
        binarySearch(array, 11);
    }
}
