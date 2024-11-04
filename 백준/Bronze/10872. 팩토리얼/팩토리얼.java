import java.io.*;
import java.util.*;

//https://www.acmicpc.net/problem/13023
public class Main {

    private int fac(int n){
        if(n == 0 || n == 1) return 1;

        return n * fac(n - 1);

    }

    public static void main(String[] args) throws IOException {

        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        System.out.println(T.fac(N));
    }

}
