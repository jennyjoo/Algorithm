import java.io.*;
import java.util.*;


public class Main {
    

    public int solution2(int[] mushrooms){
        int answer = 0;

        int[] arr = new int[mushrooms.length];
        arr[0] = mushrooms[0];
        for(int i = 1; i < mushrooms.length; i++){
            arr[i] = arr[i-1] + mushrooms[i];
        }

        int rt = 0;

        while(rt < mushrooms.length){
            int gap = 100 - arr[rt];
            if(Math.abs(gap) <= Math.abs(100 - answer)){
                answer = Math.max(arr[rt], answer);
            }else{
                if(gap < 0) break;
            }
            rt++;
        }



        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] mushrooms = new int[10];

        for(int i = 0; i < 10; i++){
            mushrooms[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(T.solution2(mushrooms));

    }
}
