class Solution {
    // public boolean isHappy(int n) {
    //     while(true){
    //            int sum=0;
    //            while(n>0){
    //              int rem=n%10;
    //             sum=rem*rem+sum;
    //             n=n/10;
    //            }
    //            n=sum;
    //     if(sum==1) return true;    
    //     if(sum==4) return false; //all unhappy number results in sum =4 eg.83,4
    //    }
    
    // }
// }
public int squareOfDigit(int num){
        int sum=0;
        while(num>0){
            int dig=num%10;
            sum+=dig*dig;
            num/=10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;
        while(fast!=1 ){
            slow=squareOfDigit(slow);
            fast=squareOfDigit(squareOfDigit(fast));
        if(fast==1) return true;
        if(slow==fast) return false;
        }
        return true;
    }
}