class Solution {
    public int[][] kClosest(int[][] points, int k) {

        PriorityQueue<int[]> heap=new PriorityQueue<>((a,b) -> b[0]-a[0]);
        int res[][]=new int[k][2];

        for( int pt[]: points)
        {
            int sq= pt[0]*pt[0] + pt[1]*pt[1];

            heap.offer(new int[]{sq,pt[0],pt[1]});
            if(heap.size()>k) 
                heap.poll();
        }
        for(int i=0;i<k;i++)
        {
            int top[]=heap.poll();
            res[i][0]=top[1];
            res[i][1]=top[2];

        }
        return res;
        
    }
}