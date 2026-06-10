class Solution {
public int lengthOfLongestSubstring(String s) {

      Set<Character> set=new HashSet<>();
      int len=0;

      for(int left=0,right=0; right<s.length();right++)
      {
        char ch=s.charAt(right);
        while(set.contains(ch)){
            set.remove(s.charAt(left)); left++;
        }

        set.add(ch);
        len=Math.max(len, set.size());
      }
      return len;
    
    
    }
}
