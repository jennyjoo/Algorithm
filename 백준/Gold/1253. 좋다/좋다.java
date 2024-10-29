import java.io.*;
import java.sql.Array;
import java.util.*;

public class Main {

    static int[] arr;
    private boolean isGood(int target, int index){
        int lt = 0;

        while(lt < arr.length - 1){
            if(lt == index) {
                lt++;
                continue;
            }
            for(int rt = lt + 1; rt < arr.length; rt++){
                if(rt == index) continue;
                int sum = arr[lt] + arr[rt];
                if(sum == target){
                    return true;
                }
            }
            lt++;
        }

        return false;
    }

    private int solution(){

        int cnt = 0;
        for(int i = 0; i < arr.length; i++){
            if(isGood(arr[i], i)){
                cnt += 1;
            }
        }


        return cnt;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        System.out.println(T.solution());
    }
}