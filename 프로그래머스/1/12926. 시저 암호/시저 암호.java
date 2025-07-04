class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        int d = n % 26;
        
        char[] chars = s.toCharArray();
        
        for(int i = 0; i < chars.length; i++){
            char c = chars[i];
            char c2 = (char)((int)c + d);
            if(Character.isUpperCase(c)){
                if(Character.isLetter(c2) && !Character.isLowerCase(c2)){
                    chars[i] = c2;
                }
                else chars[i] = (char)((int)c2 - 26);
            }
            else if(Character.isLowerCase(c)){
                if(Character.isLetter(c2) && !Character.isUpperCase(c2)){
                    chars[i] = c2;
                }
                else chars[i] = (char)((int)c2 - 26);
            }

        }
        
        
        return answer = String.valueOf(chars);
    }
}