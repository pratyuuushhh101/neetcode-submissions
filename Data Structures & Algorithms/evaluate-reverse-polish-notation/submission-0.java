class Solution {
    public int evalRPN(String[] tokens) {

        Deque<Integer> st=new ArrayDeque<>();
        for(int i=0;i<tokens.length;i++)
        {
            if (!tokens[i].equals("-") && !tokens[i].equals("*") && !tokens[i].equals("/") && !tokens[i].equals("+")){
                int n=Integer.parseInt(tokens[i]);
                st.push(n);
            }
            else{
                if(tokens[i].equals("+"))
            {
                int a=st.pop();
                int b=st.pop();
                st.push(b+a);
            }
            else if(tokens[i].equals("-"))
            {
                int a=st.pop();
                int b=st.pop();
                st.push(b-a);
            }
            else if(tokens[i].equals("*"))
            {
                int a=st.pop();
                int b=st.pop();
                st.push(b*a);
            }
            else
            {
                int a=st.pop();
                int b=st.pop();
                st.push(b/a);
            }
            }
        }
        return st.pop();
        
    }
}