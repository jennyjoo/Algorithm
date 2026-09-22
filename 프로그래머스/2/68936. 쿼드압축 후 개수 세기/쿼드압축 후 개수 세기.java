class Solution {
    
    // inner class == static class
    // 메모리, Garbage Collector
    private static class Count {
        private int zeros = 0;
        private int ones = 0;
        
        // constructor
        public Count(int zeros, int ones) {
            this.zeros = zeros;
            this.ones = ones;
        }
        
        // method
        public Count add(Count count) {
            return new Count(
                this.zeros + count.zeros, 
                this.ones + count.ones
            );
        }
    }
    private static int[][] arr;
    
    /**
        (x, y) 를 기준으로 len 길이의 정사각형이 전부 같은 숫자가 아니면, 4등분하기
    */
    private Count recursiveCount(int x, int y, int len) {
                
        // 기준점 숫자
        int val = arr[y][x];

        
        // 전부 같은 숫자인지 확인
        for (int i = y; i < y + len; i++) {
            for (int j = x; j < x + len; j++) {
                
                // 전부 같지 않다면, 4등분
                if(val != arr[i][j]) {
                    
                    int nextLen = len/2;
                    
                     return recursiveCount(x, y, nextLen)
                    .add(recursiveCount(x + nextLen, y, nextLen))
                    .add(recursiveCount(x, y + nextLen, nextLen))
                    .add(recursiveCount(x + nextLen, y + nextLen, nextLen));
                }
               
            }
        }
        
        // 만약 애초에 Solution.arr.length == 0 이라 반복문을 타지 않았다면
        return val == 0 ? new Count(1, 0) : new Count(0, 1);
    }
    
    public int[] solution(int[][] arr) {
    
        // Solution.arr 또는 this.arr 
        // BUT Solution.arr 권장
        Solution.arr = arr;
        
        Count ans = recursiveCount(0,0, Solution.arr.length);
        
        
        int[] answer = new int[]{ans.zeros, ans.ones};
        return answer;
    }
}