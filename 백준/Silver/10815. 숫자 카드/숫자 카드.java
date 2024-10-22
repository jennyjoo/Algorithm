import java.io.*;
import java.sql.Array;
import java.util.*;

public class Main {

    static boolean[] out;

    boolean binarySearch(int target, int[] arr){
        int l = 0, r = arr.length - 1;
        int mid;

        while(l <= r){
            mid = (l + r)/2;

            int num = arr[mid];

            if(num > target){
                r = mid-1;
            }
            else if(num < target){
                l = mid + 1;
            }
            else if(num == target){
                return true;
            }
        }

        return false;
    }

    private void solution(int[] has, int[] arr){

        Arrays.sort(has);
        for(int i = 0; i < arr.length; i++){
            if(binarySearch(arr[i], has)){
                out[i] = true;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] has = new int[N];
        for(int i = 0; i < N; i++){
            has[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int[] arr = new int[M];
        for(int i = 0; i < M; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        out = new boolean[M];
        T.solution(has, arr);

        for(boolean b : out){
            if(b){
                sb.append("1 ");
            }
            else{
                sb.append("0 ");
            }
        }

        System.out.println(sb.toString().trim());

    }
}