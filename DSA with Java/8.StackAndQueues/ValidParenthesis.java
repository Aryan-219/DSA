import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String s = "[";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (stack.isEmpty() && (c == '[' || c == '{' || c == '(')) {
                stack.push(c);
            } else if (c == '[' || c == '{' || c == '(') {
                char x = stack.peek();
                if (x == '[' || x == '{' || x == '(') {
                    stack.push(c);
                }
            }else if(stack.isEmpty() && (c == '}'||  c == ')' || c == ']')){
                return false;
            }
            else if((stack.peek()=='{' && c == '}') || (stack.peek()=='(' && c == ')') || (stack.peek()=='[' && c == ']')){
                stack.pop();
            }else {
                return false;
            }
        }
        if(stack.isEmpty()){

            return true;
        }else{
            return false;
        }
    }
}