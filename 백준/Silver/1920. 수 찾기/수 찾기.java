import java.io.*;
import java.util.*;

public class Main {

    private int binarySearch(int target, int[] arr) {

        int lt = 0;
        int rt = arr.length - 1;
        int mid;

        while (lt <= rt) {
            mid = (lt + rt)/2;
            int val = arr[mid];
            if (target < val) {
                rt = mid - 1;
            }
            else if (val < target) {
                lt = mid + 1;
            }
            else {
                return mid;
            }
        }

        return -1;
    }

    private boolean[] check(int[] arr1, int[] arr2) {
        boolean[] result = new boolean[arr2.length];

        for(int i = 0; i < arr2.length; i++) {
            int index = binarySearch(arr2[i], arr1);
            result[i] = index > -1 ;
        }

        return result;
    }


    public static void main(String[] args) throws IOException {

        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];



        // 첫번째 arr
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0;  st.hasMoreTokens() ; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        // 두 번째 arr
        int M = Integer.parseInt(br.readLine());
        int[] arr2 = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; st.hasMoreTokens(); i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        
        // 결과
        boolean[] results = T.check(arr, arr2);
        for(boolean b : results) {
            sb.append(b ? 1 : 0).append("\n");
        }

        // 출력
        System.out.println(sb.toString());
    }
}
