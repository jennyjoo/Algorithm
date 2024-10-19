import java.io.*;
import java.util.*;

public class Main {


    class Person{
        String name;
        int age;

        Person(int age, String name){
            this.age = age;
            this.name = name;
        }
    }

    private void solution(String[] info){
        List<Person> list = new ArrayList<>();
        for(int i = 0; i < info.length; i++){
            String[] p = info[i].split(" ");
            int age = Integer.parseInt(p[0]);

            list.add(new Person(age, p[1]));
        }

        list.sort((o1, o2) -> Integer.compare(o1.age, o2.age));

        for(Person p : list){
            System.out.println(p.age + " " + p.name);
        }
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        int N = Integer.parseInt(br.readLine());
        String[] info = new String[N];
        for(int i =0; i < N; i++){
            info[i] = br.readLine();
        }

        T.solution(info);
    }
}