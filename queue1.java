public class Queue1{
    static class Queue{
        static int arr[];
        static int size;
        static int rear;

        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }

        //empty
        public static boolean isEmpty(){
            return rear==-1;
        }

        //add
        public static void add(int n){
            if(isEmpty()){
                System.out.println("EMPTY");
            }
            rear++;
            arr[rear] = n;
        }

        //remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("EMPTY");
            }
            int front = arr[0];
            for(int i=0; i<arr.length; i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return front;
        }

        //peek
        public static int peek(){
            if (isEmpty()){
                System.out.println("EMPTY");
            }
            return arr[0];
        }
    }

    public static void main(String[] args){
        Queue q1 = new Queue;
        // q1.add(10);
        // q1.add(50);
        // q1.add(40);

        System.out.println(q1.peek());
    }
}