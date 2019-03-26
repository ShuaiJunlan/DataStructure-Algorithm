package $031;

import java.util.Stack;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 11:16 AM 3/26/19.
 */
public class Solution {
    public boolean isPopOrder(int[] push, int[] pop){
        if (push == null || pop == null){
            return false;
        }
        Stack<Integer> stack = new Stack<>();
        int index = 0;
        for (int value : push) {
            if (value == pop[index]) {
                index++;
                while (!stack.isEmpty()) {
                    if (pop[index] == stack.peek()) {
                        stack.pop();
                        index++;
                    } else {
                        break;
                    }
                }
            } else {
                stack.push(value);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {4,5,3,2,1};
        int[] c = {4,3,5,1,2};
        Solution solution = new Solution();
        System.out.println(solution.isPopOrder(a, b));
        System.out.println(solution.isPopOrder(a, c));
    }
}
