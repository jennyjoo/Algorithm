import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int trial = sc.nextInt();
        int n1;
        int n2;
        int[][] nCr = new int[31][31]; //파스칼의 삼각형
        //초기화
        for(int i = 0; i < 31; i++){
            nCr[i][0] = 1;
            nCr[i][i] = 1;
        }
        for(int i = 1; i < 31; i++){ // 행
            for(int j = 1; j < 31; j++){ //열
                nCr[i][j] = nCr[i-1][j-1] + nCr[i-1][j];
            }
        }



        //3번쩨 줄이 2C_x
        for(int i = 0; i < trial; i++){
            n1 = sc.nextInt();
            n2 = sc.nextInt();

            System.out.println(nCr[n2][n1]);
        }
    }
}