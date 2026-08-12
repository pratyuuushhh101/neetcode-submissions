class Solution {
    PriorityQueue<Integer> heap;
    int k;
    public int findKthLargest(int[] nums, int k) {
        this.k=k;
        heap=new PriorityQueue<>();

        for(int n:nums) 
            helper(n);

        return heap.peek();
    }


        public void helper(int num)
        {
            heap.offer(num);
            if(heap.size()>k)
            {
                heap.poll();             
            }
        }


        
    
}