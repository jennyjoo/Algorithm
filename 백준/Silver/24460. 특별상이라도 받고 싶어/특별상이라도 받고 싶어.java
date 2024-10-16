import java.io.*;
import java.util.*;

public class Main {

    static int[][] arr;

    private int recursive(int x, int y, int size){
        List<Integer>list = new ArrayList<>();


        if(size == 2){
            for(int i = x; i < x + size; i++){
                for(int j = y; j < y + size; j++){
                    list.add(arr[i][j]);
                }
            }

        }
        else{
            int half = size/2;
            for(int i = x; i <= x + half; i += half){
                for(int j = y; j <= y + half; j += half){
                    list.add(recursive(i, j, half));
                }
            }


        }
        list.sort(Integer::compare);
        return list.get(1);
    }

    private int solution(int[][] array){
        int answer = 0;
        if(arr.length == 1) return arr[0][0];

        answer = recursive(0, 0, array.length);

        return answer;
    }
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        arr = new int[N][N];

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        sb.append(T.solution(arr));

        System.out.println(sb.toString());

    }


}
