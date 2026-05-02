class Solution {
    public boolean noValid(int n){
        if(n==3 ||n==4||n==7)return true;
        return false;
    }
    public boolean isGood(int n){
        if(n==2 ||n==5 ||n==6|| n==9)return true;
        return false;
    }
    public int rotatedDigits(int n) {
        int count=0;
        if(n<=9){
            for(int i=1;i<=n;i++){
                if(i==2|| i==5|| i==6 || i==9)count++;
            }
        }
        else{
           
            for(int i=1;i<=n;i++){
                int no=i;
                boolean invalid=false;
                boolean good=false;
                while(no!=0){
                    int digit=no%10;
                    no=no/10;
                    if(noValid(digit)){
                        invalid=true;
                        break;
                    }
                    if(isGood(digit)) good=true;
                   
                }
                 if(!invalid && good)count++;
              
            }

        }
        return count;
    }
}