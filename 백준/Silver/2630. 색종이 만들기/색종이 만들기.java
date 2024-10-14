import java.io.*;
import java.util.*;

public class Main {

    class Count{
        int white;
        int blue;

        Count(int white, int blue){this.white = white; this.blue = blue;}

        public Count add(Count other){
            return new Count(white + other.white, blue + other.blue);
        }
    }

    static short[][] arr;

    private void solution(){
        Count c = count(0, 0, arr.length);

        System.out.println(c.white + " " + c.blue);
    }

    private Count count(int offsetX, int offsetY, int size){
        short init = arr[offsetY][offsetX];
        int h = size / 2;
        for(int col = offsetX; col < offsetX + size; col++){
            for(int row = offsetY; row < offsetY + size; row++){
                if(arr[row][col] != init){
                    return count(offsetX, offsetY, h)
                            .add(count(offsetX + h, offsetY, h))
                            .add(count(offsetX + h, offsetY + h, h))
                            .add(count(offsetX, offsetY + h, h));
                }
            }
        }

        if(arr[offsetY][offsetX] == 1) return new Count(0, 1);
        else return new Count(1, 0);

    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        arr = new short[N][N];

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                arr[i][j] = Short.parseShort(st.nextToken());
            }
        }

        T.solution();

    }
}
