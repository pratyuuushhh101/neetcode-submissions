class Solution {
public int lengthOfLongestSubstring(String s) {

        String res="";
        int left=0;
        int len=res.length();
        for(int right=0;right<s.length();right++)
        {
            while(res.contains(String.valueOf(s.charAt(right))))           
            {
                res = res.substring(1);
            }
            
                res+=s.charAt(right); 
                len=Math.max(len, res.length());
        }
        return len;

    }
}
