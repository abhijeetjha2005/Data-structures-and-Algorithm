class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer, Integer> ans=new HashMap<>();
        //  int n=nums.length;
         for(int num:nums){
            ans.put(num,ans.getOrDefault(num,0)+1);
            if(ans.get(num)>n/2){
                return num;
            }
         }
         return -1;
    }
}