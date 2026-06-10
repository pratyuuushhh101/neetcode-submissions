class Solution {

    public String encode(List<String> strs) {
        StringBuilder res=new StringBuilder();

        for(String s : strs){
            res.append(s.length()).append("#").append(s);
        }
        return res.toString();

    }

    public List<String> decode(String str) {

        List<String> st=new ArrayList<>();
        
        for(int i=0;i<str.length();)
        {
            int j=i;
            while(str.charAt(j)!='#') j++;

            int len=Integer.parseInt(str.substring(i,j));
            st.add(str.substring(j+1,j+1+len));
            i=1+j+len;            
        }

        return st;
    }
}
