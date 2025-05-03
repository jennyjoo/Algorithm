import java.util.*;
import java.io.*;

public class Main {

    public class Member {
        int level;
        String nickName;

        Member(int level, String nickName){
            this.level = level;
            this.nickName = nickName;
        }
    }
    public class Room {
        int bound;
        int head;
        List<Member> members = new ArrayList<>();

        Room(Member member){
            this.bound = member.level;
            this.head = m;
            members.add(member);
            head--;
        }

        boolean isJoinable(int level){
            if(head == 0) return false;
            if(bound - 10 > level || bound + 10 < level) return false;
            return true;
        }
        boolean addMember(Member member){
            if(!isJoinable(member.level)) return false;
            this.members.add(member);
            head--;
            return true;
        }
    }

    private void function(){
        StringTokenizer st;
        for(String str : input){

            /**
             * Get Information
             */
            st = new StringTokenizer(str);
            int level = Integer.parseInt(st.nextToken());
            String nickName = st.nextToken();

            if(rooms.isEmpty()){
                rooms.add(new Room(new Member(level, nickName)));
                continue;
            }

            /**
             * Find and Add
             */
            Optional<Room> found = rooms.stream().filter((room -> room.isJoinable(level))).findFirst();

            found.ifPresentOrElse(room -> room.addMember(new Member(level, nickName)), () -> {
                Room newRoom = new Room(new Member(level, nickName));
                rooms.add(newRoom);
            });

        }
    }

    private static String[] input;
    private static int p, m;

    private static List<Room> rooms;
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        p = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        input = new String[p];

        rooms = new ArrayList<>();
        for(int i = 0; i < p; i++){
            input[i] = br.readLine();
        }

        /**
         * Run
         */
        T.function();

        /**
         * Print
         */
        for(Room room : rooms){
            room.members.sort((a, b) -> {
                return a.nickName.compareTo(b.nickName);
            });
            if(room.head == 0){
                sb.append("Started!").append('\n');
                for(Member member : room.members){
                    sb.append(member.level)
                    .append(" ")
                    .append(member.nickName)
                    .append('\n');
                }
            }
            else{
                sb.append("Waiting!").append('\n');
                for(Member member : room.members){
                    sb.append(member.level)
                            .append(" ")
                            .append(member.nickName)
                            .append('\n');
                }
            }
        }

        System.out.println(sb.toString());
    }
}