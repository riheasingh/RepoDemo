class Solution {
     public void moveZeroes(int[] arr) {
        // int noz=0;
        // int j=0;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==0)noz++;
        //     else{
        //         arr[j++]=arr[i];
        //     }
        // }
        // while(noz>0){
        //     arr[j++]=0;
        //     noz--;
        // }

        
        //stack
        int noz=0;
        int j=0;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)noz++;
            else st.push(arr[i]);
        }
        while(!st.isEmpty()){
            arr[j++]=st.pop();
        }
        
       for(int i=0;i<j/2;i++){
        int temp=arr[i];
        arr[i]=arr[j-i-1];
        arr[j-i-1]=temp;
        }
        while(noz>0){
            arr[j++]=0;
            noz--;
        }



    
  }
}