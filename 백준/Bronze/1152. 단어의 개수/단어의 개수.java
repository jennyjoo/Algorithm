import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        if(str.replaceAll(" ", "").isEmpty()) System.out.println(0);
        else System.out.println(str.trim().split(" ").length);

    }
}