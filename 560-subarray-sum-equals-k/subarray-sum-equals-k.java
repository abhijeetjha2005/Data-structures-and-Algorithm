class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map= new HashMap<>();
        int n=nums.length;
        map.put(0,1);
        int cnt=0;
        int sum=0;
        
        for(int i=0;i<n;i++){
            sum+=nums[i];
           int target=sum-k;
            if(map.containsKey(target)){
                cnt+=map.get(target);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return cnt;
    }
}