package $225;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 3:19 PM 4/6/19.
 */
public class MyStack {
    private Queue<Integer> queue = new LinkedList<>();

    public MyStack() {

    }

    public void push(int x) {
        queue.add(x);
        for (int i=1; i<queue.size(); i++) {
            queue.add(queue.remove());
        }
    }

    public int pop() {
        return queue.remove();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}
