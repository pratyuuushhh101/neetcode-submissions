class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int res[]=new int[temperatures.length];
        Deque<Integer> st=new ArrayDeque<>();
        st.push(0);
        for(int i=1;i<temperatures.length;i++)
        {
            while(!st.isEmpty() && temperatures[i]>temperatures[st.peek()])
            {
                int j=st.pop();
                res[j]=i-j;
            }
            st.push(i);
        }
        return res;
    }
}