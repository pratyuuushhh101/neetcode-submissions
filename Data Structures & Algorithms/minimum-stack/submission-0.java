class MinStack {
    Deque<Integer> st;
    Deque<Integer> minSt;

    public MinStack() {
        st=new ArrayDeque<>();
        minSt=new ArrayDeque<>();
        
        
    }
    
    public void push(int value) {
        st.push(value);
        if(minSt.isEmpty())
            minSt.push(value);
        else
            minSt.push(Math.min(value, minSt.peek()));
        
    }
    
    public void pop() {
        if(!st.isEmpty())
            st.pop();
        if(!minSt.isEmpty()) minSt.pop();       
    }
    
    public int top() {
            return st.peek();
    }
    
    public int getMin() {
        return minSt.peek();
        
    }
}
