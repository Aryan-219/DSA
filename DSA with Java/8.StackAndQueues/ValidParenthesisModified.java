// Here, in this implementation, we will not consider [{}] to be a valied parenthesis string 
import java.util.Stack;
public class ValidParenthesisModified {
    public static void main(String[] args) {
        String s = "([])";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        boolean flag = true;
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(i%2==0){

                if(c == '(' || c == '{' || c == '[') {
                    stack.push(c);
                }else{
                    return false;
                }
            }else{
                char x = stack.peek();
                if((c== '}' && x == '{')  ||  (c == ')' && x == '(') || (c == ']' && x == '[') ){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        return flag;
    }
}
