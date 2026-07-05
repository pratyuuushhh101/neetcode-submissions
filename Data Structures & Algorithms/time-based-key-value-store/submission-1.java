class TimeMap {
     HashMap<String, List<String>> val;
        HashMap<String, List<Integer>> ts;

    public TimeMap() {
        val=new HashMap<>();
        ts=new HashMap<>();
        
    }
    
    public void set(String key, String value, int timestamp) {
        if(!val.containsKey(key)){
            val.put(key, new ArrayList<>());
            ts.put(key, new ArrayList<>());
        }
        val.get(key).add(value);
        ts.get(key).add(timestamp);        
    }
    public String get(String key, int timestamp) {
        if(!val.containsKey(key)) return "";
        int ind=-1;
        
        int lo=0,hi=ts.get(key).size()-1;
        while(lo<=hi)
        {
            int m=(lo+hi)/2;

            if(ts.get(key).get(m)>timestamp)
            {
                hi=m-1;
            }
            else{
                ind=m;
                lo=m+1;
            }
        }
        if(ind!=-1)
        return val.get(key).get(ind);
        else
        return "";
    }
}