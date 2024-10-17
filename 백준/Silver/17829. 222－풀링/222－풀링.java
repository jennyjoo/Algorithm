import java.awt.color.ICC_ColorSpace;
import java.io.*;
import java.util.*;

public class Main {

    static int[][] arr;
    private int recursive(int x, int y, int size){
        if(size == 1) return arr[y][x];

        List<Integer> list = new ArrayList<>();

        int half = size/2;
        for(int i = x; i <= x + half; i+=half){
            for(int j = y; j <= y + half; j+=half){
                list.add(recursive(i, j, half ));
            }
        }

        list.sort(Comparator.reverseOrder());
        int second = list.get(1);
        return second;
    }


    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        arr = new int[N][N];

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j <N; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(T.recursive(0,0,arr.length));

    }


}
