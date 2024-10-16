import java.io.*;
import java.util.*;

public class Main {


    static int K, N;
    static int[] arr;
    static int[] temp;

    static int count = 0;

    private int[] solution(){
        int[] answer = {};

        mergeSort(0, arr.length - 1);

        if(count < K) System.out.println(-1);
        return answer;
    }

    private void mergeSort(int l, int r){
        if(l == r) return;

        int mid = (l + r)/2;

        mergeSort(l, mid);
        mergeSort(mid + 1, r);
        merge(l, mid, r);
    }

    private void merge(int l, int mid, int r){
        int i = l;
        int j = mid + 1;
        int index = l;

        while(i <= mid && j <= r){
            if(arr[i] < arr[j]){
                temp[index++] = arr[i++];
            }else{
                temp[index++] = arr[j++];
            }
        }

        while(i <= mid){
            temp[index++] = arr[i++];
        }
        while(j <= r){
            temp[index++] = arr[j++];
        }

        for(int k = l; k <= r; k++){
            arr[k] = temp[k];
            count += 1;

            if(count == K){
                for(int ind : arr) System.out.print(ind + " ");
                System.out.println();
                return;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        arr = new int[N];
        temp = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int j = 0; j < N; j++) {
            arr[j] = Integer.parseInt(st.nextToken());
        }

        T.solution();

    }


}
