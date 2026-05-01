class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> list=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String str=words[i];
            for(int j=0;j<words.length;j++){
                String str1=words[j];
                if(i!=j && str1.length()>=str.length()){
                    if(str1.contains(str)){
                        list.add(str);
                        break;
                    }
                }
            }
        }
        return list;
    }
}