class Solution {
    public String reverseVowels(String s) {
        int i =0;
        int j = (s.length())-1;
        String v = "aeiouAEIOU";
        char[] chars = s.toCharArray();
        while(i<j){
            if(v.contains(chars[i]+"") && v.contains(chars[j]+"")){
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                i++;
                j--;
            }else{
                if(!v.contains(chars[i]+"")){
                    i++;
                }
                if(!v.contains(chars[j]+"")){
                    j--;
                }
            }
            
        }
        return new String(chars);
    }
}