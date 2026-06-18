class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        for(int i=0;i<piles.length;i++)
        {
            max=Math.max(piles[i],max);
        }
        int lo=1,hi=max; long c=0; int k=max;

        
            while(lo<=hi)
            {
                int m=(lo+hi)/2;
                c=0;
                for(int i=0;i<piles.length;i++)
                {
                    c+=(piles[i]+m-1)/m;                
                }
                if(c<=h)
                {
                    hi=m-1;
                    k=Math.min(k,m);
                }
                else{
                    lo=m+1;
                }
                
            }
        return k;
        }
}