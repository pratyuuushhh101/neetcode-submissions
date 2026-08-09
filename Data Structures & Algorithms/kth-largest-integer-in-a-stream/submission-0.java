class KthLargest {

    PriorityQueue<Integer> mh;
    int k;

    public KthLargest(int k, int[] nums) {
        this.k=k;
        mh=new PriorityQueue<>();
        for(int num:nums) add(num);
        
    }
    
    public int add(int val) {
        mh.offer(val);
        if(mh.size()>k) mh.poll();
        return mh.peek();
        
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */