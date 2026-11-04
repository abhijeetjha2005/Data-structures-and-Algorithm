class Solution {
    public int trap(int[] height) {
        int l=0;
        int n=height.length;
        int r=n-1;
        int water=0;
        int leftMax=height[l];
        int rightMax=height[r];
        while(l<r){
            if(leftMax<rightMax){
                l++;
                leftMax=Math.max(leftMax,height[l]);
                water+=leftMax-height[l];
                
            }
            else{
                r--;
                rightMax=Math.max(rightMax,height[r]);
                water+=rightMax-height[r];

            }
        }
        return water;
    }
}