import java.io.*;
import java.util.*;

public class Main {

    class Point{
        int a, b;
        Point(int a, int b){
            this.a = a;
            this.b = b;
        }
    }
    public static void main(String[] args) throws IOException {

        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(br.readLine());
       //https://www.acmicpc.net/problem/13023



        int[][] arr = new int[N][2];
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (o1, o2) -> {
            if(o1[0] == o2[0]){
                return Integer.compare(o1[1], o2[1]);
            }

            return Integer.compare(o1[0], o2[0]);
        });

        for(int[] a : arr){
            System.out.println(a[0] + " " + a[1]);
        }

    }

}
