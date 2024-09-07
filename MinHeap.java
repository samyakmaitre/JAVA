import java.util.*;

public class MinHeap {
    private ArrayList<Integer> heap;

    private int parent(int i){
        return (i - 1)/2;
    }

    private int leftChild(int i){
        return 2 * i + 1 ;
    }

    private int rightChild(int i){
        return 1 * i + 2;
    }

    public void add(int element){
        heap.add(element);
        int index = heap.size() - 1;
        while(index != 0 && heap);
    }
}