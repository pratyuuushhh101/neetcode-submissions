class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int arr[]=new int[nums1.length+nums2.length];
        int i,j,ind=0;
        for(i=0,j=0;i<nums1.length&&j<nums2.length;)
        {
            if(nums1[i]<=nums2[j]){
                arr[ind]=nums1[i];
                i++;
            }
            else{
            arr[ind]=nums2[j];
            j++;
            }
            ind++;
        }
        if(i==nums1.length){
            for(;j<nums2.length;j++)
            {
                arr[ind]=nums2[j];
                ind++;
            }
        }
        if(j==nums2.length){
            for(;i<nums1.length;i++)
            {
                arr[ind]=nums1[i];
                ind++;
            }
        }
        if(arr.length%2==0)
        {
            return (arr[(arr.length/2 -1)]+arr[(arr.length/2)])/2.0;
        }
        else
        return arr[(int)Math.floor(arr.length/2)];

    }
}