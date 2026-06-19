class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> map=new HashMap<>();
        int res=0,max=0;
        for(int left=0,right=0;right<s.length();right++)
        {
            char ch=s.charAt(right);
            
            if(map.containsKey(ch))
                map.put(ch, map.get(ch)+1);
            else
                map.put(ch,1);

            max=Math.max(max, map.get(ch));
            while((right-left+1)-max > k)
            {
                map.put(s.charAt(left), map.get(s.charAt(left))-1);
                left++;
            }
            res=Math.max(res, (right-left+1));

            
        }

        return res;
    }
}
