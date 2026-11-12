class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int l=0;
        for(int i=1;i<n;i++){
          if(nums[i]==nums[l]){
            continue;
          }else{
            l++;
            int temp=nums[i];
            nums[i]=nums[l];
            nums[l]=temp;
          }

        }
        return l+1;
    }
}