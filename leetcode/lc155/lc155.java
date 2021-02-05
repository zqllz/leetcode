package lc155;

import java.util.Stack;

/**
 * @author yuluyang
 * @date 2021/1/30 下午5:44
 * @since 1.0.0-SNAPSHOT
 */
public class lc155 {
}

class MinStack {

    Stack<Integer> data;
    Stack<Integer> minStack;
    /** initialize your data structure here. */
    public MinStack() {
        data = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        data.push(x);
        if (minStack.size() == 0 || minStack.peek() > x) {
            minStack.push(x);
        }
        if(minStack.empty() || data.peek() <= minStack.peek()) {
            minStack.push(x);
        }
    }

    public void pop() {
        int tmp = data.pop();
        if (minStack.peek() == tmp) {
            minStack.pop();
        }
    }

    public int top() {
        return data.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}