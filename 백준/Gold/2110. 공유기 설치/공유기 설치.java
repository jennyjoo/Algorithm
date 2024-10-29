import java.io.*;
import java.sql.Array;
import java.util.*;

public class Main {

    static int[] houses;

    private void solution(int c){

        int lt = 1;
        int rt = houses[houses.length-1] - houses[0] + 1;

        int mid;

        while(lt < rt){
            mid = (lt + rt)/2;

            int count = 1;
            int last = houses[0];
            for(int j = 1; j < houses.length; j++){
                if(houses[j] - last >= mid){
                    count++;
                    last = houses[j];
                }
            }


            if(count >= c){
                lt = mid + 1;
            }
            else{
                rt = mid;
            }
        }

        System.out.println(lt-1);


    }
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        houses = new int[N];

        for(int i =0 ; i < N; i++){
            houses[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(houses);

        T.solution(C);
    }
}