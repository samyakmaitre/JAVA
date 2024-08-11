import java.util.*;

public class endodfile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int lineNumber = 0;
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            lineNumber++;
            System.out.println(lineNumber + " "+ line);
            
        }
        scanner.close();
    }
}
