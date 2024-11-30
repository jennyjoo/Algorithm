import java.util.*;
import java.io.*;

public class Main {

    class Score {
        int kor;
        int eng;
        int math;
        Score(int kor, int eng, int math){
            this.kor = kor;
            this.eng = eng;
            this.math = math;
        }
    }
    class Student {
        String name;
        Score score;

        Student(String name, Score score){
            this.name = name;
            this.score = score;
        }

    }

    private List<Student> solution(String[] studentInfo){
        List<Student> list = new ArrayList<>();
        StringTokenizer st;
        for(String info : studentInfo){
            st = new StringTokenizer(info);
            String  name = st.nextToken();

            list.add(new Student(name,
                    new Score(Integer.parseInt(st.nextToken()),
                            Integer.parseInt(st.nextToken()),
                            Integer.parseInt(st.nextToken()))
                    )
            );
        }

        list.sort((o1, o2) -> {
            if(o1.score.kor == o2.score.kor){
                if(o1.score.eng == o2.score.eng){
                    if(o1.score.math == o2.score.math) return o1.name.compareTo(o2.name);
                    return Integer.compare(o2.score.math, o1.score.math);
                }
                return Integer.compare(o1.score.eng, o2.score.eng);
            }
            else{
                return Integer.compare(o2.score.kor, o1.score.kor);
            }
        });

        return list;
    }
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        String[] info = new String[n];

        for(int i = 0; i < n; i++){
            info[i] = br.readLine();
        }

        for(Student student : T.solution(info)){
            sb.append(student.name).append("\n");
        }

        System.out.println(sb.toString().trim());

    }
}