class MinStack {
    // Using full paths so we don't need the 'import' line
    private java.util.Stack<Integer> stack;
    private java.util.Stack<Integer> minStack;

    public MinStack() {
        stack = new java.util.Stack<>();
        minStack = new java.util.Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty()) {
            minStack.push(val);
        } else {
            minStack.push(Math.min(val, minStack.peek()));
        }
    }
    
    public void pop() {
        stack.pop();
        minStack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}