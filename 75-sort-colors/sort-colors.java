class Solution {
    
    public void sortColors(int[] nums) {
        int n=nums.length;
        int s=0;
        int mid=0;
        int e=n-1;
        while(mid<=e){
            if(nums[mid]==0){
             int temp=nums[s];
             nums[s]=nums[mid];
             nums[mid]=temp;
             s++;
             mid++;
            }else if(nums[mid]==1){
                // mid=mid[s];
                mid++;
            }
            else if(nums[mid]==2){
                // mid =mid[e];
             int temp=nums[mid];
             nums[mid]=nums[e];
             nums[e]=temp;
             e--;
            }
        }
    }
}