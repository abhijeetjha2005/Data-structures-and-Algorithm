class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int l=0;
        int n=nums.length;
        int total=0;
        int prod=1;
        for(int r=0;r<n;r++){
             prod *=nums[r];
             if(k<=1){
                return 0;
             }
          while(prod>=k){
            prod /=nums[l];
            l++;
          }
          total +=r-l+1;
        }
        return total;
    }
}
// l=0
// for(r to n-1)
// sum
// if(sum<k)
// store
// return
