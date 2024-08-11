import java.util.LinkedList;

public class newLinkedList {
    public static void main(String args[]){
        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(0,1);
        ll.add(1,2);
        ll.add(2,3);
        ll.add(3,4);
        ll.add(4,5);
        ll.add(5,6);

        System.out.println(ll.get(2)+10);
    }
}
