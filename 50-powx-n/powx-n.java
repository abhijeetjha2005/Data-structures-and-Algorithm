class Solution {
    public double power(double x,long n){
        if(n==0){
            return 1;
        }
        double half=power(x,n/2);
        double res=half*half;
         if(n%2!=0){
            res=res*x;
         }
     return res;
    }
    public double myPow(double x, int n) {
   long pow=n;
        if(pow<0){
            return 1/power(x,-pow);
            // pow=-pow;
        }
 return    power(x,pow);
    }
}