class Solution {
    public int largestAltitude(int[] gain) {
        //t.c=0(n) s.c=0(n)


        // int[] result=new int[gain.length+1];
        // result[0]=0;
        // int maxAltitude=0;
        // for(int i=1;i<=gain.length;i++){
        //     result[i]=result[i-1]+gain[i-1];
        //     if(result[i]>maxAltitude) maxAltitude=result[i];
        // }
        // return maxAltitude;

        // optimised code
        int maxAltitude=0;
        int currentAltitude=0;
        for(int g:gain){
            currentAltitude+=g;
            if(currentAltitude>maxAltitude) maxAltitude=currentAltitude;
        }
        return maxAltitude;
 
}
}