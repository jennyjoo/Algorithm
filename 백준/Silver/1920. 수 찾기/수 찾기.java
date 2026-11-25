import java.util.*;
import java.io.*;

public class Main {

    private boolean hasNumber(int[] array, int target) {
        int lt = 0, rt = array.length - 1;
        int mid = (lt + rt) / 2;

        // 단순 값 찾기
        while (lt <= rt) {
            if (array[mid] == target) {
                return true;
            }
            else if (array[mid] < target) {
                lt = mid + 1;
            }
            else if (target < array[mid]) {
                rt = mid - 1;
            }

            mid = (lt + rt) / 2;
        }

        return false;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for( int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);


        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++) {
            if(T.hasNumber(arr, Integer.parseInt(st.nextToken()))) {
                sb.append("1").append("\n");
            }
            else{
                sb.append("0").append("\n");
            }
        }
        

        System.out.println(sb.toString());

    }
}