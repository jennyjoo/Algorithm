import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());

        for(int i = input; i> 0; i--){
            System.out.println(i);
        }

    }
}