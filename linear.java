public class linear {
    public static int linearsearch(int array[], int key){
        for(int i=0;i<array.length; i++){
            if(array[i]==key){
                return i;
            }
        
        }
        return -1;
    }

    public static void main(String[] args){
        int numbers[] = {2,4,6,8,10,12};
        int find= 10;
        int out= linearsearch(numbers, find);

        if(out==-1){
            System.out.println("Not found");
        }
        else{
            System.out.println("Index is: "+out);
        }
    }
}
