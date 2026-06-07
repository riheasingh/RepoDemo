class Solution {
    public int largestInteger(int num) {

        // char[] arr = Integer.toString(num).toCharArray();

        // for (int i = 0; i < arr.length; i++) {

        //     int maxPos = i;

        //     for (int j = i + 1; j < arr.length; j++) {

        //         // same parity + larger digit
        //         if (arr[j] > arr[maxPos] &&
        //            (arr[i] - arr[j]) % 2 == 0) {

        //             maxPos = j;
        //         }
        //     }

        //     // swap
        //     char temp = arr[i];
        //     arr[i] = arr[maxPos];
        //     arr[maxPos] = temp;
        // }

        // return Integer.parseInt(new String(arr));


        //Heap
      PriorityQueue<Integer> even=new PriorityQueue<>(Collections.reverseOrder());
      PriorityQueue<Integer> odd=new PriorityQueue<>(Collections.reverseOrder());
         char[] arr = Integer.toString(num).toCharArray();
         for(int i=0;i<arr.length;i++){
            int val=arr[i]-'0';
            if(val%2==0)even.add(val);
            else odd.add(val);
         }
         StringBuilder sb=new StringBuilder();
         for(int i=0;i<arr.length;i++){
            int val=arr[i]-'0';
            if(val%2==0)sb.append(even.poll());
            else sb.append(odd.poll());
         }
         return Integer.parseInt(sb.toString());
    }
}