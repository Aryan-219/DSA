import java.util.Stack;

public class MinToValidParenthesis {
    public static void main(String[] args) {
        String s = "()))";
        System.out.println(isValid(s));
    }

    public static int isValid(String s) {
        int count = 0;
        Stack<Character> stack = new Stack<Character>();
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
                count++;
            }
            else if((stack.peek()=='{' && c == '}') || (stack.peek()=='(' && c == ')') || (stack.peek()=='[' && c == ']')){
                stack.pop();
            }else {
                // return false;
                count++;
            }
        }
        if(stack.isEmpty()){

            return count;
        }else{
            while(!stack.isEmpty()){
                stack.pop();
                count++;
            }
        }
        return count;
    }
}