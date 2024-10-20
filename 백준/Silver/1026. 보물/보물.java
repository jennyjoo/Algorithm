import java.io.*;
import java.util.*;

public class Main {

    static short[] A;
    static short[] B;
    static int N;

    private void solution(){
        Arrays.sort(A);
        Arrays.sort(B);

        int sum = 0;
        for(int i = 0; i < N; i++){
            sum += A[i] * B[N - i + -1];
        }

        System.out.println(sum);

    }


    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        N = Short.parseShort(br.readLine());


        A = new short[N];
        B = new short[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N ; i++){
            A[i] = Short.parseShort(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N ; i++){
            B[i] = Short.parseShort(st.nextToken());
        }

        T.solution();

    }
}