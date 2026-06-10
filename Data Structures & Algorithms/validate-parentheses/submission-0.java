class Solution {
    public boolean isValid(String s) {
        Deque<Character> st=new ArrayDeque<>();
        int f=0; int count=0;
        if(s.length()==1)return false
        ;

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
                if(ch=='(' || ch== '{' || ch=='[')
                    st.push(ch);
                else
                {
                    if(st.isEmpty() || (ch==')' && st.peek() != '(' ) || (ch=='}' && st.peek() != '{' ) ||
                        (ch==']' && st.peek() != '[' ) )
                        return false;
                    else
                        st.pop();
                } 
        }
        
        return st.isEmpty();
    }
}