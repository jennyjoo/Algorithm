import java.util.*;
class Solution {
    
    static int[] a = new int[]{1, 2, 3, 4, 5};
    static int[] b = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
    static int[] c = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5,};
    
    public int[] solution(int[] answers) {
        int[] answer = {};
        
        int[] total = new int[3];
        for(int i = 0; i < answers.length; i++){
            int indexA = i % a.length;
            int indexB = i % b.length;
            int indexC = i % c.length;
            
            if(answers[i] == a[indexA]) total[0]++;
            if(answers[i] == b[indexB]) total[1]++;
            if(answers[i] == c[indexC]) total[2]++;
        }
        
        int max = Arrays.stream(total).max().getAsInt();
        System.out.println(max);
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 3; i++) {
            if(total[i] == max) list.add(i + 1);
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}