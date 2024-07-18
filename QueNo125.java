class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() == 0){
            return true;
        }
        String result = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int i = 0;
        int j = result.length()-1;
        while(i<j){
            if(result.charAt(i)==result.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }
}