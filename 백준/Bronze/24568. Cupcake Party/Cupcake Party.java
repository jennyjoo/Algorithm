import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int r = Integer.parseInt(br.readLine()) * 8;
        int s = Integer.parseInt(br.readLine()) * 3;

        System.out.println((r + s) - 28);


    }
}