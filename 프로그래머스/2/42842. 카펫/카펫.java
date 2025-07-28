class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int half = brown/2;
        int perimeter = half - 2;
        
        for(int width = 1; width < perimeter; width += 1){
            int height = perimeter - width;
            if(height * width == yellow){
                answer[0] = Math.max(height, width) + 2;
                answer[1] = Math.min(height, width) + 2;
                break;
            }
        }
        
        
        return answer;
    }
}