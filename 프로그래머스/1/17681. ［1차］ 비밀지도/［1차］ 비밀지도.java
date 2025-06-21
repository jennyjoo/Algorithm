class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};
        
        answer = new String[arr1.length];
        
        for(int i = 0; i < arr1.length; i++){
            String first = Integer.toBinaryString(arr1[i]);
            String second = Integer.toBinaryString(arr2[i]);
            
            first = "0".repeat(n - first.length()).concat(first);
            second = "0".repeat(n - second.length()).concat(second);
            
            
            char[] out = new char[first.length()];
            for(int j = 0; j < first.length(); j++){
                if(first.charAt(j) == second.charAt(j) && first.charAt(j) == '0'){
                    out[j] = ' ';
                }
                else{
                    out[j] = '#';
                }
            }
            
            answer[i] = String.valueOf(out);
            
        }
        
        return answer;
    }
}