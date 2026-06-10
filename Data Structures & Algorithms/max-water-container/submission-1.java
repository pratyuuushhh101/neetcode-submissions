class Solution {
    public int maxArea(int[] height) {

        int maxProd=0;
        int left=0,right=height.length-1;

        while(left<right)
        {
            maxProd= Math.max(maxProd, (Math.min(height[left],height[right]) * (right-left)));
            if(height[right]>height[left]) left++;
            else if(height[right]<height[left]) right--;
            else{
                left++;right--;
            }

        }
        return maxProd;

    }
}
