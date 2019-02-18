package $155;

import java.util.Stack;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 8:04 PM 2/18/19.
 */
public class MinStack {
    private Stack<Integer> value, min;
    /** initialize your data structure here. */
    public MinStack() {
        value = new Stack<>();
        min = new Stack<>();
    }

    public void push(int x) {
        value.push(x);
        if (min.isEmpty()){
            min.push(x);
        }else {
            min.push(x < min.peek() ? x : min.peek());
        }
    }

    public void pop() {
        value.pop();
        min.pop();
    }

    public int top() {
        return value.peek();
    }

    public int getMin() {
        return min.peek();
    }
}
