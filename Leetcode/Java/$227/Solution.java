package $227;

import java.util.Stack;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 4:36 PM 4/8/19.
 */
public class Solution {
    public int calculate(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        char[] arr = s.trim().toCharArray();
        Stack<Integer> num = new Stack<>();
        Stack<Character> operation = new Stack<>();
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case '+':
                    operation.push('+');
                    flag = false;
                    break;
                case '-':
                    operation.push('-');
                    flag = false;
                    break;
                case '*':
                    num.push(num.pop() * (arr[++i] - '0'));
                    flag = false;
                    break;
                case '/':
                    num.push(num.pop() / (arr[++i] - '0'));
                    flag = false;
                    break;
                default:
                    if (flag){
                        num.push(num.pop() * 10 + (arr[i]-'0'));
                    }else {
                        num.push(arr[i] - '0');
                        flag = true;
                    }

                    break;
            }
        }
        while (!operation.isEmpty()) {
            if (operation.pop() == '+') {
                num.push(num.pop() + num.pop());
            } else {
                num.push(num.pop() - num.pop());
            }
        }

        return num.pop();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.calculate("3+2-23*23");
    }
}
