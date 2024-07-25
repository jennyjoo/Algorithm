import java.io.*;
import java.util.*;

public class Main {


    public int solution(String s, String target) {
        char[] str = s.toCharArray();
        char[] tar = target.toCharArray();

        int lt = 0;
        int rt = 0;

        int cnt = 0;

        for(int k = 0; k < tar.length; k++){
            int currCnt = 0;
            while(lt < str.length){
                if(str[lt] == tar[0]){
                    rt = lt;
                    int i = 0;
                    for(; i < tar.length && rt < str.length; i++){
                        if(str[rt] == tar[i]){
                            rt++;
                        }
                        else{
                            //break 빼먹으면 aabb/ab 반례 통과 못 함
                            break;
                        }
                    }

                    if(i == tar.length){
                        currCnt++;
                        lt = rt;
                        continue;
                    }
                }
                lt++;
            }

            if(cnt < currCnt ) cnt = currCnt;
        }


        return cnt;

    }



    public static void main(String[] args) throws IOException {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        System.out.println(T.solution(sc.nextLine(), sc.nextLine()));

    }
}
