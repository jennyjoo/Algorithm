import java.awt.color.ICC_ColorSpace;
import java.io.*;
import java.util.*;

public class Main {

    private boolean isPal(String input, int l, int r){
        if(l == r) return true;

        int lt = l;
        int rt = r;
        while(lt < rt){
            if(input.charAt(lt) != input.charAt(rt)) break;
            lt++;
            rt--;
        }

        if(lt < rt){
            return false;
        }

        int mid = (l + r)/2;
        if((rt - lt + 1)%2 == 0){ //짝수 길이
            return isPal(input, l, mid) && isPal(input, mid + 1, r);
        }
        else{
            return isPal(input, l, mid -1) && isPal(input, mid+1, r);
        }
    }

    private String solution(String input){
        if(isPal(input, 0, input.length()-1)){
            return "AKARAKA";
        }
        return "IPSELENTI";
    }
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        System.out.println(T.solution(input));

    }


}
