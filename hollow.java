public class hollow {

    public static void patter(int rows, int cols){
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if ((r == 0 || r == rows || c == 0 || c == cols)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
        }
        System.out.println(); // Move to the next line after each row
    }

    public static void main(String[] args) {
        patter(10,7);
    }
}
