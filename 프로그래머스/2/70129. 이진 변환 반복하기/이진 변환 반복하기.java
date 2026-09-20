import java.util.*;

class Solution {
    
    static int removedZeros = 0;
    static int count = 0;
        
    private void run(String str) {
        
        if (str.equals("1")) return;
        
        String removed = str.replaceAll("0", "");
        String binary = Integer.toBinaryString(removed.length());

        removedZeros += str.length() - removed.length();
        count++;
        
        run(binary);
    }
    
    public int[] solution(String s) {
        run(s);
        return new int[] {count, removedZeros};
    }
}