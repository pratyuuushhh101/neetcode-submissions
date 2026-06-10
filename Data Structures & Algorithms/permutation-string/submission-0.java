class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int a1[]=new int[26];
        int a2[]=new int[26];
        
        s2=s2.toUpperCase();
        s1=s1.toUpperCase();

        if(s1.length() > s2.length()) return false;

        for(int i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i);
            a1[((int)ch-65)]++;
        }

        int left=0,right=s1.length()-1;

        for(int i=0;i<s1.length();i++)
        {
            char ch=s2.charAt(i);
            a2[((int)ch-65)]++;
        }


        while(right<s2.length())
        {
            int count=0;
            for(int i=0;i<26;i++)
            {
                if(a1[i] == a2[i])
                    count++;
            }
            if(count ==26) return true;
            if(right<s2.length()-1)
            {
                a2[s2.charAt(left)-'A'] --;
                a2[s2.charAt(right+1)-'A']++;
                left++;
            }
            right++;            
        
        }

        return false;
    }
}
