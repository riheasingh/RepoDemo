class Solution {
    public List<String> commonChars(String[] words) {
        List<String> list=new ArrayList<>();
        for(int i=0;i<words[0].length();i++){
            String ch=words[0].substring(i,i+1);
            boolean flag=true;
            for(int j=words.length-1;j>=1;j--){
                int idx=words[j].indexOf(ch);
                if(idx==-1){
                    flag=false;
                    break;
                }
                words[j]=words[j].substring(0,idx)+words[j].substring(idx+1);
            }
            if(flag) list.add(ch);
           
        }
        return list;
        
    }
}