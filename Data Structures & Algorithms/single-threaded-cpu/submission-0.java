class Solution {
    public int[] getOrder(int[][] tasks) {
        int time=0;
        int ar[][]=new int[tasks.length][3];
        for(int i=0;i<tasks.length;i++)
        {
            ar[i]=new int[]{tasks[i][0],tasks[i][1],i};
        }
        Arrays.sort(ar,(a,b)->a[0]-b[0]);
        PriorityQueue<int[]> heap=new PriorityQueue<>((a,b)->a[1]!=b[1]? a[1]-b[1] : a[2]-b[2]);
        int res[]=new int[tasks.length];
        int curr=0,n=tasks.length,tsk=0;
        while(curr<n)
        {
            while(tsk<n && ar[tsk][0]<=time)
            {
                heap.offer(ar[tsk]);
                tsk++;
            }
            if(heap.isEmpty())
            {
                time=ar[tsk][0]; continue;
            }
            int t[]=heap.poll();
            time+=t[1];
            res[curr++]=t[2];
        }
        return res;

        
    }
}