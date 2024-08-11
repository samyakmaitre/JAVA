import java.util.Stack;

public class validparentheses2{
    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();

        for(char c: s.toCharArray()){
            if(c=='(' || c =='{' || c=='['){
                stack.push(c);
            }else if(c==')' && (stack.isEmpty() || stack.pop()!='(')){
                return false;
            }else if(c=='}' && (stack.isEmpty() || stack.pop()!='{')){
                return false;
            }else if(c==']' && (stack.isEmpty() || stack.pop()!='{')){
                return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args){
        String test1 = "({}([]))";
        System.out.println(isValid(test1));
    }
}