import java.util.Stack;

public class duplicateparentheses {
    public static boolean hasDuplicate(String exp){
        Stack<Character> stack =new Stack<>();
        for(char ch : exp.toCharArray()){
            if(ch == ')'){
                char top = stack.pop();
                int eInside = 0;
                while(top!='('){
                    eInside++;
                    top = stack.pop();
                }
                if(eInside < 1){
                    return true;
                }
            }else {
                stack.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        
    }
}
