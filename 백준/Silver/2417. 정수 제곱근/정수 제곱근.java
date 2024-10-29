import java.io.*;
import java.sql.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        long input = Long.parseLong(br.readLine());

        long out = (long)Math.sqrt(input);
        if(Math.pow(out,2) < input) out += 1;
        System.out.println(out);

    }
}