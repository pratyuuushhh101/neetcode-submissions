class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap=new PriorityQueue<>(Collections.reverseOrder());
        for(int n:stones)
            heap.offer(n);

        while(heap.size()>1)
        {
            int x=heap.poll();
            int y=heap.poll();
            if(x!=y) heap.offer(x-y);
        }
        return heap.size()==1? heap.peek() : 0;
             
    }
}