import java.io.*;
import java.sql.Array;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int[] alphabets = new int[26];

        for(char c : str.toLowerCase().toCharArray()){
            int index = c - 'a';
            alphabets[index]++;
        }

        for(int i : alphabets){
            System.out.print(i + " ");
        }



    }
}