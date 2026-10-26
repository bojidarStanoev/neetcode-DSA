class MinStack {
    ArrayList<Integer> stack = null;
    Stack<Integer> min = new Stack();
    public MinStack() {
        this.stack=new ArrayList<>();
    }
    
    public void push(int val) {
        if( min.isEmpty()   || val<=min.peek()){
            min.push(val);
        }
        stack.addLast(val);
    }
    
    public void pop() {
        if(stack.getLast().equals(min.peek()) ){
            min.pop();
        }
        stack.removeLast();
    }
    
    public int top() {
        return stack.getLast();
    }
    
    public int getMin() {
       
        return min.peek();
    }
}
