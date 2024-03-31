package Stack_Queue_HashMap;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String exp = "{([])}";
        System.out.println(checkBalancedParentheses(exp));
    }

    public static boolean checkBalancedParentheses(String exp) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.empty()) {
                    return false;
                } else {
                    char topChar = stack.peek();
                    if (c == ')' && topChar!= '('
                            || c == ']' && topChar!= '['
                            || c == '}' && topChar!= '{') {
                        return false;
                    } else {
                        stack.pop();
                    }
                }
            }
        }
        return stack.empty();
    }
}