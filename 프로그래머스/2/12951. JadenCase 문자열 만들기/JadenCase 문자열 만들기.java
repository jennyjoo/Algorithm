class Solution {
    public String solution(String s) {
        String answer = "";
        
        char[] chars = s.toLowerCase().toCharArray();
        
        for(int i = 0; i < chars.length; i++){
            if(chars[i] == ' '){
                continue;
            }
            if(i == 0) chars[0] = Character.toUpperCase(chars[0]);
            if(i > 0 && i < chars.length){
                if(chars[i-1] == ' ' && chars[i] != ' '){
                    chars[i] = Character.toUpperCase(chars[i]);
                }
            }
        }
        
        
        return String.valueOf(chars);
    }
}