import java.io.*;
import java.sql.Array;
import java.util.*;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static int[] note1;
    static int[] note2;

    private void binarySearch(int target){

        int l = 0;
        int r = note1.length - 1;
        int mid;

        while(l <= r){
            mid = (l + r)/2;

            if(note1[mid] > target){
                r = mid - 1;
            }
            else if(note1[mid] < target){
                l = mid + 1;
            }
            else{
                sb.append(1 + "\n");
                return;
            }
        }

        sb.append(0 + "\n");
        return;
    }


    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int TestCase = Integer.parseInt(br.readLine());
        for(int i = 0; i < TestCase; i++){
            int N = Integer.parseInt(br.readLine());
            note1 = new int[N];
            StringTokenizer st =  new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                note1[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(note1);

            int M = Integer.parseInt(br.readLine());
            note2 = new int[M];
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++){
                note2[j] = Integer.parseInt(st.nextToken());
            }

            for(int k = 0; k < M; k++){
                T.binarySearch(note2[k]);
            }
        }

        System.out.println(sb.toString());

    }
}