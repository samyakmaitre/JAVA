public class java24{
    public static void swapp(int a, int b){

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.print("a is: " + a + "b is: " + b);

    }

    public static void main(String args[]){
        swapp(56, 34);
    }
}