import java.util.*;

public class toCharArray {
    public static void main(String[] args){
        String myString = "Samyak";
        char[] myArr = myString.toCharArray();
        for(int i=0; i<myArr.length; i++){
            System.out.println(myArr[i]);
        }
    }
}
