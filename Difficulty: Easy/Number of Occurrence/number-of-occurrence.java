class Solution {
    public int first(int[] arr,int target){
         int n= arr.length;
         int s=0;
         int e=n-1;
         int ans=-1;
         while(s<=e){
             int mid=s+(e-s)/2;
             if(arr[mid]==target){
                 ans=mid;
                 e=mid-1;
             }else if(arr[mid]<target){
                 s=mid+1;
             }else{
                 e=mid-1;
             }
         }
         return ans;
    }
    public int last(int[] arr,int target){
         int n= arr.length;
         int s=0;
         int e=n-1;
         int ans=-1;
         while(s<=e){
             int mid=s+(e-s)/2;
             if(arr[mid]==target){
                 ans=mid;
                 s=mid+1;
             }else if(arr[mid]<target){
                 s=mid+1;
             }else{
                 e=mid-1;
             }
         }
         return ans;
    }
    int countFreq(int[] arr, int target) {
        int lastIdx=last(arr,target);
        int firstIdx=first(arr,target);
        for(int i=0;i<arr.length;i++){
            if(firstIdx==-1){
                return 0;
            }
        }
        int Occ=lastIdx-firstIdx+1;
        return Occ;
        
    }
}
