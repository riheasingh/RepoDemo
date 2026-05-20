class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashSet<Integer> setA=new HashSet<>();
        HashSet<Integer> setB=new HashSet<>();
        int[] ans=new int[A.length];
        for(int i=0;i<A.length;i++){
            if(A[i]==B[i]){
                ans[i]++;
                if(i>0)ans[i]+=ans[i-1];
                continue;
            }
            setA.add(A[i]);
            setB.add(B[i]);
            if(setA.contains(B[i]))ans[i]++;
            if(setB.contains(A[i]))ans[i]++;
            if(i>0)ans[i]+=ans[i-1];
        }
        return ans;
    }
}