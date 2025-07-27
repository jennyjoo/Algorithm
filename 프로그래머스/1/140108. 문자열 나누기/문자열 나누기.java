class Solution {
    static int cnt = 0;
    private String func(String s, char c){
        int isX = 0;
        int notX = 0;
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == c) isX++;
            else notX++;
                        
            if(isX == notX){
                cnt++;
                return s.substring(i + 1);
            }
        }
        
        cnt++;
        return "";
    }
    
    public int solution(String s) {
        int answer = 0;
        
        while(true){
            s = func(s, s.charAt(0));
            if(s.length() == 0) break;
        }
        return cnt;
    }
}