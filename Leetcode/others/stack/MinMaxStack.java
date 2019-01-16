package stack;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 2:50 PM 1/16/19.
 */
public final class MinMaxStack {
    private final Stack<Integer> dataStack = new Stack<>();
    private final Stack<Integer> minStack = new Stack<>();
    private final Stack<Integer> maxStack = new Stack<>();

    public synchronized Integer getMin(){
        if (minStack.isEmpty()){
            throw new EmptyStackException();
        }
        return minStack.peek();
    }
    public synchronized Integer getMax(){
        if (maxStack.isEmpty()){
            throw new EmptyStackException();
        }
        return maxStack.peek();
    }
    public synchronized void push(Integer a){
        dataStack.push(a);
        if (minStack.isEmpty() || a.compareTo(minStack.peek()) < 0){
            minStack.push(a);
        }else {
            minStack.push(minStack.peek());
        }
        if (maxStack.isEmpty() || a.compareTo(maxStack.peek()) > 0){
            maxStack.push(a);
        }else {
            maxStack.push(maxStack.peek());
        }
    }
    public synchronized Integer pop(){
        if (dataStack.isEmpty()){
            throw new NullPointerException();
        }
        minStack.pop();
        maxStack.pop();
        return dataStack.pop();
    }

    public static void main(String[] args) {
        MinMaxStack minMaxStack = new MinMaxStack();
        minMaxStack.push(2);
        minMaxStack.push(3);
        minMaxStack.push(1);
        minMaxStack.push(9);

        System.out.println("min value: " + minMaxStack.getMin());
        System.out.println("max value: " + minMaxStack.getMax());

        System.out.println("pop value: " + minMaxStack.pop());

        System.out.println("min value: " + minMaxStack.getMin());
        System.out.println("max value: " + minMaxStack.getMax());

        System.out.println("pop value: " + minMaxStack.pop());

        System.out.println("min value: " + minMaxStack.getMin());
        System.out.println("max value: " + minMaxStack.getMax());

        System.out.println("pop value: " + minMaxStack.pop());

        System.out.println("min value: " + minMaxStack.getMin());
        System.out.println("max value: " + minMaxStack.getMax());

        System.out.println("pop value: " + minMaxStack.pop());
    }
}
