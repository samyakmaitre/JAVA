import java.util.ArrayList;

public class awesomeSort {

    public static void main(String[] args) {
        int[] arr = {5, 10, 30, 7};
        customSort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void customSort(int[] arr) {
        ArrayList<Integer> evenDivBy5 = new ArrayList<>();
        ArrayList<Integer> evenNotDivBy5 = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        ArrayList<Integer> evenIndices = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                if (arr[i] % 5 == 0) {
                    evenDivBy5.add(arr[i]);
                } else {
                    evenNotDivBy5.add(arr[i]);
                }
            } else {
                oddNumbers.add(arr[i]);
            }

            if (i % 2 == 0) {
                evenIndices.add(arr[i]);
            }
        }

        // Sort the ArrayLists if necessary
        // Collections.sort(evenDivBy5);
        // Collections.sort(evenNotDivBy5);
        // Collections.sort(oddNumbers);
        // Collections.sort(evenIndices);

        // Merge sorted lists back into arr
        int index = 0;
        for (int num : evenDivBy5) {
            arr[index++] = num;
        }
        for (int num : evenNotDivBy5) {
            arr[index++] = num;
        }
        for (int num : oddNumbers) {
            arr[index++] = num;
        }
        for (int num : evenIndices) {
            arr[index++] = num;
        }
    }
}
