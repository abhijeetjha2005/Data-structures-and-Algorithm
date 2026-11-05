class Solution {
    public int longestOnes(int[] nums, int k) {
     int l=0;
     int n=nums.length;
     int zeroCnt =0;
     for(int i=0;i<n;i++){
        if(nums[i]==0){
            zeroCnt++;
        }
        if(zeroCnt>k){
            if(nums[l]==0){
                zeroCnt--;
            }
        l++;
        }
     }
    
     return n-l;   
    }
}