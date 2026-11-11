class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int col=matrix[0].length;
        int n=row*col;
        int s=0;
        int e=n-1;
        while(s<=e){
            int mid =e+(s-e)/2;
            int r=mid/col;
            int c=mid%col;
            if(matrix[r][c]==target){
                return true;
            }else if(matrix[r][c]<target){
                s=mid+1;;
            }else{
                e=mid-1;
            }
        }
            return false;
    }
}