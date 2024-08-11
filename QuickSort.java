public class QuickSort {
    
    //method to perform quick sort
    public static void quickSort(int[] array, int low, int high){
        if(low<high){
            //Partition the array and get the pivot index
            int pivotIndex = partition(array, low, high);

            //Recursively sort the elements before and after the partition
            quickSort(array, low, pivotIndex-1);
            quickSort(array, pivotIndex+1, high);
        }
    }

    //Method to partition the array
    public static int partition(int[] array, int low, int high){
        int pivot = array[high]; //choosing the last element as the pivot
        int i = low -1; //Index of the smaller element

        for(int j = low; j<high; j++){
            //if the current element is smaller than or equal to the pivot
            if(array[j]<= pivot){
                i++;

                //swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        //swap array[i+1] and array[high] (or pivot)
        int temp = array[i+1];
        array[i+1]= array[high];
        array[high] = temp;

        return i+1; //return the pivot index
    }

    //Method to print array
    public static void printArray(int[] array){
        for(int i : array){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    //main
    public static void main(String[] args) {
        int[] array = {10,7,8,9,1,5};
        int n = array.length;

        printArray(array);
        quickSort(array, 0, n-1);
        printArray(array);
    }
}
