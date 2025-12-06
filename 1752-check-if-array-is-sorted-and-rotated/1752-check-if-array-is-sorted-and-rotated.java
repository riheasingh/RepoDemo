class Solution {
    public boolean check(int[] nums){
        int n=nums.length;
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=nums[i];
        }
        Arrays.sort(a);
        for(int x=0;x<n;x++){
            if(a[x]!=nums[0]) continue;
            boolean ok=true;
            for(int i=0;i<n;i++){
                if(nums[i]!=a[(i+x)%n]){
                    ok=false;
                    break;
                } 
            }
            if(ok) return true;
        }
        return false;
    }
}
