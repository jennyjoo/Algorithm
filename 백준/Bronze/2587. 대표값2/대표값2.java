import java.io.*;
import java.util.*;

//https://www.acmicpc.net/problem/13023
public class Main {

    public static void main(String[] args) throws IOException {

        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[5];

        int sum = 0;
        for(int i = 0; i < 5; i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        Arrays.sort(arr);

        System.out.println(sum/5);
        System.out.println(arr[5/2]);
    }

}
