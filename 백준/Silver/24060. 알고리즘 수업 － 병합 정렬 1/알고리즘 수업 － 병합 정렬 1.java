import java.io.*;
import java.util.*;

public class Main {

    static int cnt = 0;
    static int K;
    static int num = -1;

    static int[] A;
    static int[] temp;

    private void mergeSort(int[] A, int l , int r){
        if(l >= r) return;

        int mid = (l + r)/2;
        mergeSort(A, l, mid);
        mergeSort(A, mid + 1, r);
        merge(A, l, mid, r);

    }

    private void merge(int[] A, int l, int mid, int r){
        int i = l;
        int j = mid + 1;
        int index = l;


        while(i <= mid && j <= r){
            if(A[i] <= A[j]){
                temp[index++] = A[i++];
            }
            else{
                temp[index++] = A[j++];
            }
        }

        while(i <= mid){
            temp[index++] = A[i++];
        }
        while(j <= r){
            temp[index++] = A[j++];
        }

        for(int in = l; in <= r; in++){
            A[in] = temp[in];
            cnt += 1;
            if(cnt == K) {num = temp[in]; return;}
        }

    }
    

    private void solution(int[] A, int K){

        mergeSort(A, 0, A.length-1);

        System.out.println(num);
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        A = new int[N];
        temp = new int[A.length];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }

        T.solution(A, K);
    }


}
