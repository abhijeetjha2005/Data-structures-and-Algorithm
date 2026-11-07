class Solution {
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
        int l=0;
        int max=0;
        // int len=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int r=0;r<n;r++){
          map.put(fruits[r],map.getOrDefault(fruits[r],0)+1);

          while(map.size()>2){
            int freq=map.get(fruits[l]);
                map.put(fruits[l], freq - 1);
            if(map.get(fruits[l])==0){
              map.remove(fruits[l]);
            }
            l++;
          }
          
          max=Math.max(max,r-l+1);
        }
        return max;
    }
}