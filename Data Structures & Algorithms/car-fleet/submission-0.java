class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int cars[][]=new int[position.length][2];
        Deque<Double> st=new ArrayDeque<>();

        for(int i=0;i<position.length;i++)
        {
            cars[i][0]=position[i];
            cars[i][1]=speed[i];
        }
        Arrays.sort(cars, (a,b) -> a[0]-b[0]);
        double time[]=new double[position.length];
        for(int i=0;i<position.length;i++)
            time[i]=(double)(target-cars[i][0])/cars[i][1];

        for(int i=position.length-1;i>=0;i--)
        {
            if(st.isEmpty() || time[i]>st.peek()) st.push(time[i]);
            if(time[i]<=st.peek()){}
        }
        return st.size();

    }
}