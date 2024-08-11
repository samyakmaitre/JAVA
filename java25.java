public class java25 {
    public static void main(String[] args) {
        int num = 10; // Original value

        System.out.println("Before: " + num); // Before the method call
        modifyValue(num);
        System.out.println("After: " + num); // After the method call
    }


    public static void main1(String[] args) {
        int num = 10; // Original value

        System.out.println("Before: " + num); // Before the method call
        modifyValue(num);
        System.out.println("After: " + num); // After the method call
    }

    public static void modifyValue(int num) {
        num = 20; // Modifying the value
    }
}
