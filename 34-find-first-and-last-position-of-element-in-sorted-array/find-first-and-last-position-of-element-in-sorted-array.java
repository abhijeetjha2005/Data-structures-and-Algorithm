class Solution {
    public int first(int[] nums,int target){
        int n=nums.length;
        int s=0;
        int e=n-1;
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]==target){
                ans= mid;
                e=mid-1;
            }else if( nums[mid]<target){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return ans;
    }

    public int last(int[] nums,int target){
        int n=nums.length;
        int s=0;
        int e=n-1;
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]==target){
                ans=mid;
                s=mid+1;
            }else if( nums[mid]<target){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int firstIdx =first(nums,target);
        int lastIdx=last(nums,target);
        return new int[] {firstIdx,lastIdx};
    }
}