import java.io.*;
import java.util.*;

public class Main {

    class Count{
        int zero;
        int one;
        int minus;

        Count(int minus, int zero, int one){
            this.minus = minus;
            this.zero = zero;
            this.one = one;
        }
        public Count add(Count other){
            return new Count(this.minus + other.minus, this.zero + other.zero, this.one + other.one);
        }
    }


    static short[][] arr;

    private void solution(int n){
        Count c = count(0, 0, n);

        System.out.println(c.minus + "\n" + c.zero + "\n" + c.one);
    }

    private Count count(int x, int y, int length){

        int oneThird = length/3;
        int init = arr[y][x];

        for(int col = x; col < x + length; col++){
            for(int row = y; row < y + length; row++){
                if(arr[row][col] != init){
                    return count(x, y, oneThird)
                            .add(count(x + oneThird, y, oneThird))
                            .add(count(x + oneThird, y + oneThird, oneThird))
                            .add(count(x, y + oneThird, oneThird))
                            .add(count(x + 2 * oneThird, y, oneThird))
                            .add(count(x + 2*oneThird, y + oneThird, oneThird))
                            .add(count(x + 2 * oneThird, y + 2 * oneThird, oneThird))
                            .add(count(x + oneThird, y + 2*oneThird, oneThird))
                            .add(count(x, y + 2*oneThird, oneThird));
                }
            }
        }

        if(init == -1) return new Count(1, 0, 0);
        else if (init == 0) return new Count(0, 1, 0);
        else return new Count(0, 0, 1);
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        arr = new short[N][N];
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                arr[i][j] = Short.parseShort(st.nextToken());
            }
        }

        T.solution(N);

    }


}
