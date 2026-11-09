class Solution {
    public int subarraySum(int[] nums, int k) {
     int n=nums.length;
     int cnt=0;
     for(int i=0;i<n;i++){
     int total=0;
    
        for(int j=i;j<n;j++){
            total +=nums[j];
        if(total ==k){
            cnt++;
        }
        }
    
     }   
     return cnt;
    }
}