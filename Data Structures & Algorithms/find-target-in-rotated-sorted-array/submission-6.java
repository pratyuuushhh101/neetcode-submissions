class Solution {
    public int search(int[] nums, int target) {
        // if(nums.length==1)
        //     if(nums[0]==target) return 0;
        //     else return -1;

        int lo=0,hi=nums.length-1;
        while(lo<hi)
        {
            int mid=(lo+hi)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid] > nums[hi])
            {
                if(nums[mid]>=target && target>=nums[lo])
                hi=mid-1;
                else
                lo=mid+1;
            }
            else if(nums[mid]<=nums[hi])
            {
                if(target>nums[mid] && target<=nums[hi])
                    lo=mid+1;
                else
                    hi=mid-1;
            }
        }
        if(nums[lo]==target) return lo;
        return -1;
        
    }
}
