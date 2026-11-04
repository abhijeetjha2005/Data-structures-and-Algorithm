class Solution {
    public void swap(int[] nums,int l,int r){
        int temp=nums[l];
        nums[l]=nums[r];
        nums[r]=temp;
    }
    public void sortColors(int[] nums) {
        int s=0;
        int n=nums.length;
        int e=n-1;
        int mid=s;
        while(mid<=e){
            if(nums[mid]==0){
                swap(nums,s,mid); 
                s++;
                mid++;
            } else if(nums[mid]==1){
                mid++;
            } else if(nums[mid]==2){
                swap(nums,mid,e);
                e--;
            }
                
            }
        }

    }


