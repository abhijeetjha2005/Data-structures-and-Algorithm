class Solution {
    public void reverse(int[] nums,int l,int r){
     
        while(l<r){
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;

            l++;
            r--;
        }
    }
    public void nextPermutation(int[] nums) {
     int n=nums.length;
     int l=0;
     int r=n-1;
     int pivot=-1;
     for(int i=n-2;i>=0;i--){
        if(nums[i]<nums[i+1]){
            pivot=i;
            break;
        }
     }   
    if(pivot ==-1){
     reverse(nums,0,n-1);
     return;
    }
    for(int i=n-1;i>=pivot+1;i--){
        if(nums[i]>nums[pivot]){
            int temp=nums[pivot];
            nums[pivot]=nums[i];
            nums[i]=temp;
            break;
        }
    }
    reverse(nums,pivot+1,n-1);
    }
}