class Solution {
    public int[] twoSum(int[] arr, int target) {
         //int[] ans=new int[2];
    //     int n=arr.length;
    //     for(int i=0;i<n;i++){
    //         for(int j=i+1;j<n;j++){
    //             if(arr[i]+arr[j]==x){
    //                 ans[0]=i;
    //                 ans[1]=j;
                
    //             }
    //         }
    //     }
    // return ans;    


    // BY HASHMAP
    HashMap<Integer,Integer> map=new HashMap<>();
    int[] ans=new int[2];
    for(int i=0;i<arr.length;i++){
        if(map.containsKey(target-arr[i])){
            ans[0]=i;
            ans[1]=map.get(target-arr[i]);
        }
        else{
            map.put(arr[i],i);
        }
    }

  
    
    return ans;
    
 
    }
    }