class Solution {
    public int maxProfit(int[] prices) {
        int left=0,right=1;
        int profit=0;
        while(right<prices.length)
        {
            if(prices[left]>prices[right])
            {
                left++;
                right=left+1;
            }
            else
            {
                profit=Math.max(prices[right]-prices[left],profit);
                right++;
            }
            

        }
        return profit;
        
    }
}