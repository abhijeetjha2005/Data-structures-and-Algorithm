class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> ans= new HashMap<>();
        for(int i =0;i<n;i++){
            ans.put(nums[i],ans.getOrDefault(nums[i],0)+1);
            if(ans.get(nums[i])>n/2){
                return nums[i];
            }
        }
        return -1;
    }
}