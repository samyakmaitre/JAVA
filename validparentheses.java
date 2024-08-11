import java.util.Stack;

public class validparentheses {
    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(c=='(' || c=='{' || c=='[' ){
                stack.push(c);
            }
            else if(c==')' && (stack.isEmpty() || stack.pop()!='(')){
                return false;
            }
            else if(c=='}' && (stack.isEmpty() || stack.pop()!='{')){
                return false;
            }
            else if(c==']' && (stack.isEmpty() || stack.pop()!='[')){
                return false;
            }
        }

        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String test1 = "()";
        String test2 = "()[]{}";
        String test3 = "(]";
        String test4 = "([)]";
        String test5 = "{[]}";

        System.out.println(isValid(test1)); // true
        System.out.println(isValid(test2)); // true
        System.out.println(isValid(test3)); // false
        System.out.println(isValid(test4)); // false
        System.out.println(isValid(test5)); // true
    }
}
