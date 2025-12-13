// class Solution {
    
//     public boolean isValidCode(String s) {
//         if (s == null || s.length() == 0) return false;

//         for (char ch : s.toCharArray()) {
//             if (!Character.isLetterOrDigit(ch) && ch != '_') {
//                 return false;
//             }
//         }
//         return true;
//     }
//     public List<String> validateCoupons(String[] code, String[] bL, boolean[] isActive) {
//         List<String> s=new ArrayList<>();
//         for(int i=0;i<code.length;i++){
           
//             if(isValidCode(code[i])){
//                 if(bL[i].equals("grocery") || bL[i].equals("electronics") || bL[i].equals("pharmacy") || bL[i].equals("restaurant") ){
//                     if(isActive[i]==true){
//                          s.add(bL[i]);
//                     }
//                 }
//             }
//         }
//         int x=s.size();
//         Collections.sort(s);
//         List<String> ans=new ArrayList<>();
//         int j=0;
//         for(int i=0;i<bL.length;i++){
//             if(j<s.size() &&s.get(j).equals(bL[i])){
//                 ans.add(code[i]);
//                 j++;
//                 i=0;
//             }
//         }
//        return ans; 
//     }
// }
class Solution {

    public boolean isValidCode(String s) {
        if (s == null || s.length() == 0) return false;

        for (char ch : s.toCharArray()) {
            if (!Character.isLetterOrDigit(ch) && ch != '_') {
                return false;
            }
        }
        return true;
    }

    public List<String> validateCoupons(String[] code, String[] bL, boolean[] isActive) {

        List<String> ans = new ArrayList<>();

        String[] order = {"electronics", "grocery", "pharmacy", "restaurant"};

        for (String business : order) {

            List<String> temp = new ArrayList<>();

            for (int i = 0; i < code.length; i++) {
                if (isActive[i]
                        && bL[i].equals(business)
                        && isValidCode(code[i])) {

                    temp.add(code[i]);
                }
            }

            Collections.sort(temp);   // lexicographical order
            ans.addAll(temp);
        }

        return ans;
    }
}
