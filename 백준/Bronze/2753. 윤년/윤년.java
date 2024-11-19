import java.util.*;
import java.io.*;

public class Main {

    public int solution(int year){
        if(year%4 == 0){
            if(year%100 == 0){
                return 0;
            }
            else if(year % 400 == 0){
                return 1;
            }
            return 1;
        }

        return 0;
    }
    public static void main(String[] args) throws IOException{
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        int input = Integer.parseInt(br.readLine());
//        System.out.println(T.solution(input));

        int y = Integer.parseInt(br.readLine());

        if(y%4==0) {
            if(y%400==0) System.out.println("1");
            else if(y%100==0) System.out.println("0");
            else System.out.println("1");
        }
        else System.out.println("0");

    }
}