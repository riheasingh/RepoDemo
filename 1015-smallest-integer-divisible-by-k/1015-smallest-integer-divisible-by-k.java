class Solution {
    public int smallestRepunitDivByK(int k) {
    if(k%2==0 || k%5==0) return -1;
    int n=1%k;
    int count=1;
    while(n!=0){
        count++;
        n=(n*10+1)%k;
    }
    return (int)count;
        
    }
}