class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        String[] copy=new String[strs.length];
        for(int i=0;i<strs.length;i++){
            copy[i]=strs[i];
        }
        for(int i=0;i<copy.length;i++){
            char[] arr=copy[i].toCharArray();
            Arrays.sort(arr);
            copy[i]=String.valueOf(arr);
        }
        HashMap<String,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
           if(map.containsKey(copy[i])){
             map.get(copy[i]).add(strs[i]);
           }
           else{
            List<String> list=new ArrayList<>();
            list.add(strs[i]);
            map.put(copy[i],list);
           }
        }
        List<List<String>> result=new ArrayList<>();
        for(List<String> group:map.values()){
            result.add(group);
        }
        return result;
        
    }
}
