class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans=new ArrayList<>();
        long val=1;
        int n=rowIndex;
        for(int i=0;i<=n;i++){
            ans.add((int)val);
            val=val*(n-i);
            val=val/(i+1);
            // ans.add(val);
        }
        return ans;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
      for(int i=0;i<numRows;i++){
       ans.add(getRow(i));
      }   
      return ans;
    }
}