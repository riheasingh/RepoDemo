class Solution {
    public void reverse(List<Integer> digits){
        int i=0;
        int j=digits.size()-1;
        while(i<=j){
            int temp=digits.get(i);
            digits.set(i,digits.get(j));
            digits.set(j,temp);
            i++;
            j--;

        }
    }
    public int[] separateDigits(int[] nums) {
        int n=nums.length;
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            int no=nums[i];
            List<Integer> digits=new ArrayList<>();
            while(no!=0){
                digits.add(no%10);
                no=no/10;
            }
            reverse(digits);
            for(int j=0;j<digits.size();j++){
                ans.add(digits.get(j));
            }
        }
        int[] res=new int[ans.size()];
        for(int i=0;i<res.length;i++){
            res[i]=ans.get(i);
        }
        return res;
    }
}