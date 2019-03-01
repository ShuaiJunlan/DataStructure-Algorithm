package $150;

import java.util.Stack;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 8:39 PM 3/1/19.
 */
public class Solution {
    public int evalRPN(String[] tokens) {
        if (tokens == null || tokens.length == 0){
            return 0;
        }
        Stack<Integer> stack = new Stack<>();
        for (String c : tokens){
            if (c.equals("+")){
                int a = stack.pop(), b = stack.pop();
                stack.push(a+b);
            }else if (c.equals("-")){
                int a = stack.pop(), b = stack.pop();
                stack.push(b-a);
            }else if (c.equals("*")){
                int a = stack.pop(), b = stack.pop();
                stack.push(a*b);
            }else if (c.equals("/")){
                int a = stack.pop(), b = stack.pop();
                stack.push(b/a);
            }else {
                stack.push(Integer.parseInt(c));
            }
        }
        return stack.pop();
    }
}
