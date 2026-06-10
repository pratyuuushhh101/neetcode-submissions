class Solution {

    public String encode(List<String> strs) {
        String result="";

        // if(strs.size()==0)
        //     return "0#";
        
        for(String s : strs){
            result+=s.length()+"#"+s;
        }
        return result;

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
