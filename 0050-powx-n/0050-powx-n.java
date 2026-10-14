class Solution {
    public double myPow(double x, int n) {
    //     long binform=n;
    //     if(n<0){
    //         x=1/x;
    //         binform=-binform;
    //     }
    //     double ans=1;
    //     while(binform>0){
    //         if(binform%2==1){
    //             ans*=x;
    //         }
    //         x*=x;
    //         binform/=2;
    //     }
    // return ans;

    long power=n;
    boolean neg=power<0;
    if(neg){
        power=-power;
    }
    double result=power(x,power);
    if(neg){
        return 1/ result;
    }
    return result;

    }
    public static double power(double x,long n){
        if(n==0){
            return 1;
        }
        double half=power(x,n/2);
        if(n%2==0){
            return half*half;
        }
        return x*half*half;
    
    }
}