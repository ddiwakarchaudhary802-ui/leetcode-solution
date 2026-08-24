class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res="";
        int chIndex=0;
        for(char ch:strs[0].toCharArray()){
            for(int i = 1;i<strs.length;i++){
                if(chIndex>=strs[i].length()|| ch !=strs[i].charAt(chIndex)){
                    return res;
                }
            }
            res+=ch;
            chIndex++;
        }
        return res;
        
    }
}