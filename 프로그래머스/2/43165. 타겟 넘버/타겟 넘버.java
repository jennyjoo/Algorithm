class Solution {
    
    static boolean[] out;
    static int[] input;
    static boolean[] operators = new boolean[]{true, false};
    static int target;
    static int count = 0;
    
    private void bfs(int depth){
        if(depth == input.length){
            int sum = 0;
            for(int i = 0; i < input.length; i++){
                sum = out[i] ? sum + input[i] : sum - input[i];
            }
            
            if(sum == target){
                count++;
            }
            return;
        }
        else{
            for(int i = 0; i < operators.length; i++){
                out[depth] = operators[i];
                bfs(depth + 1);
            }

        }
    }
    
    public int solution(int[] numbers, int target) {
        int answer = 0;
        
        this.input = numbers;
        this.target = target;
        this.out = new boolean[input.length];
        
        // System.out.println(input);
        bfs(0);
        
        return count;
    }
}