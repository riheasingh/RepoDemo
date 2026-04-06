class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        // int ones=0;
        // int zeroes=0;
        // for(int i=0;i<students.length;i++){
        //     if(students[i]==0){
        //         zeroes++;
        //     }
        //     else ones++;
        // }
        // for(int j=0;j<sandwiches.length;j++){
        //     if(sandwiches[j]==0){
        //         if(zeroes==0) return ones ;
        //         zeroes--;
        //         }
        //         else {
        //              if(ones==0) return  zeroes;
        //         ones--;
        //         }
        //     }
        // return 0;
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<students.length;i++){
            q.add(students[i]);
        }
        int j=0;
        int count=0;
        while(q.size()>0){
              if(q.peek()==sandwiches[j]){
                j++;
                q.poll();
                count=0;
              }
              else{
                int ele=q.poll();
                q.add(ele);
                count++;
              }
              if(count==q.size())break;
        }
        return q.size();
    }
}