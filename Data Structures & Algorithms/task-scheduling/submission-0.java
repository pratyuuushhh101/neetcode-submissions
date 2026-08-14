class Solution {
    public int leastInterval(char[] tasks, int n) {
        PriorityQueue<Integer> heap=new PriorityQueue<>(Collections.reverseOrder());
        int freq[]=new int[26];
        for(char t :tasks)
        {
            freq[(int)t-(int)'A']++;
        }

        for(int i:freq)
            if(i>0) heap.offer(i);
        
        Queue<int[]> q=new LinkedList<>();

        int time=0;
        while(!heap.isEmpty() || !q.isEmpty())
        {
            time++;
            if(!heap.isEmpty())
            {
                int co=heap.poll()-1;
                if(co>0) q.offer(new int[]{co,time+n});
            }
            if(!q.isEmpty() && q.peek()[1]==time)
                heap.offer(q.poll()[0]);
        }
        return time;

        
    }
}