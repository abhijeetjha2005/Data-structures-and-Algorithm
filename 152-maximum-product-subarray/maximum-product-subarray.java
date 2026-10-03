class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int curMax=nums[0];
        int curMin=nums[0];
        int maxProduct=nums[0];
        for(int i=1;i<n;i++){
            int num=nums[i];
        
        int a=num;
        int b=num*curMax;
        int c=num*curMin;
        int newMax=Math.max(a,Math.max(b,c));
        int newMin=Math.min(a,Math.min(b,c));
        curMax=newMax;
         curMin=newMin;
        
        maxProduct=Math.max(maxProduct,curMax);
        }
        return maxProduct;
    }
}