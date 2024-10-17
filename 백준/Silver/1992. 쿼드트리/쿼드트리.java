import java.awt.color.ICC_ColorSpace;
import java.io.*;
import java.util.*;

public class Main {

    static int N;
    static int[][] map;


    private boolean isUniform(int x, int y, int size){
        int init = map[y][x];
        for(int i = x; i < x + size; i++){
            for(int j = y; j < y + size; j++){
                if(init != map[j][i])
                    return false;
            }
        }
        return true;
    }

    private String recursive(int x, int y, int size){

        if(isUniform(x, y, size)){
            return "" + map[y][x];
        }
        else{
            int half = size/2;

            String str = new String();
            str = "(";
            for(int i = y; i <= y + half; i += half){
                for(int j = x; j <= x + half; j+= half){

                    str += recursive(j, i, half);

                }
            }
            str += ")";

            return str;
        }
    }
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        map = new int[N][N];

        for(int i = 0; i < N; i++){
            String input = br.readLine();
            for(int j = 0; j < N; j++){
                map[i][j] = input.charAt(j) - (int)'0';
            }
        }

        System.out.println(T.recursive(0,0,N));

    }


}
