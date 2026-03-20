class Solution {
    public boolean lemonadeChange(int[] arr) {
        int sum=0;
        int count5=0,count10=0,count20=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==5){
               sum+=arr[i];
               count5++;
            }
            else if(arr[i]==10){
                if(count5>0){
                    sum+=arr[i];
                    count5--;
                    count10++;
                }
                else  return false;
                
            }
            else{
                if(count10>0 && count5>0){
                    sum+=arr[i];
                    count5--;
                    count10--;
                    count20++;
                }
                else if(count5>=3){
                    sum+=arr[i];
                    count5-=3;
                    count20++;
                }
                else return false;
            }
        }
        return true;
    }
}