class Solution {
    public int lengthOfLastWord(String s) {
        int result = 0;
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                count = 0;
            } 
            else {
                count++;
                result = count;
            }
        }
        return result;
    }
}