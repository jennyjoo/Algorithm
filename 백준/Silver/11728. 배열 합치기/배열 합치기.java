import java.io.*;
import java.util.*;

public class Main {

    public void solution(int[] arr1, int[] arr2) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int pt1 = 0;
        int pt2 = 0;

        while(pt1 < arr1.length && pt2 < arr2.length){
            if(arr1[pt1] >= arr2[pt2]){
                bw.write(arr2[pt2++] + " ");
            }
            else if(arr1[pt1] < arr2[pt2]){
                bw.write(arr1[pt1++] + " ");
            }
        }

        if(pt1 == arr1.length){
            for(int i = pt2; i < arr2.length; i++){
                bw.write(arr2[i] + " ");
            }
        }else{
            for(int i = pt1; i < arr1.length; i++){
                bw.write(arr1[i] + " ");
            }
        }

        bw.flush();
        bw.close();

    }


    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++){
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        T.solution(arr1, arr2);


    }
}
