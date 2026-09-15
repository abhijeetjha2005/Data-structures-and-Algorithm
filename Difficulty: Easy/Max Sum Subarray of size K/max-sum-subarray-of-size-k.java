class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int n=arr.length;
           int sum =0;
          
           for(int i=0;i<k;i++){
               sum+=arr[i];
           }
            int max=sum;
           for(int j=k;j<n;j++){
               sum+=arr[j];
               sum-=arr[j-k];
               max=Math.max(max,sum);
           }
           return max;
    }
}