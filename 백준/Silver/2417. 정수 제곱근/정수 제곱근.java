import java.io.*;
import java.sql.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        long input = Long.parseLong(br.readLine());

        long lt = 0;
        long rt = input;
        long mid;

        while(lt < rt){
            mid = (lt + rt)/2;

            if(input <= Math.pow(mid,2)){
                rt = mid;
            }
            else{
                lt = mid + 1;
            }
        }

        System.out.println((long)lt);

    }
}