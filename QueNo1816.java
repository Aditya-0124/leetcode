class Solution {
    public String truncateSentence(String s, int k) {
        int count = 0;
        String a = s;
        for(int i =0; i<s.length(); i++){
            if (s.charAt(i)== ' '){
                count++;
            }
            if(count == k){
                break;
            }
            a = s.substring(0, i+1);
        }
        return a;
        
    }
}