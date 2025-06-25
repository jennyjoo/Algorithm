// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
import java.io.*;

class Main {
    
    class Point{
        int x;
        int y;

        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    
    static boolean[][] visited;
    static String[] map;
    
    static int[] dx = {0, 1, 0, -1}, dy = {1, 0, -1, 0};
    
    private boolean check(int x, int y){
        if( x < 0 || y < 0  || x >= map[0].length() || y >= map.length || visited[y][x] || map[y].charAt(x) == '#'){
            return false;
        }
        
        return true;
    }
    
    private int BFS(int x, int y){
        Queue<Point> q = new LinkedList<>();
        
        char c = map[y].charAt(x);
        
        int v = 0;
        int k = 0;
        q.offer(new Point(x, y));
        visited[y][x] = true;
        
        while(!q.isEmpty()){
            Point curr = q.poll();
            
            if(map[curr.y].charAt(curr.x) == 'v') v++;
            else if(map[curr.y].charAt(curr.x) == 'k') k++;
            
            for(int d = 0; d < 4; d++){
                int nx = curr.x + dx[d];
                int ny = curr.y + dy[d];
                
                if(!check(nx, ny)) continue;
                Point point = new Point(nx, ny);
                visited[ny][nx] = true;
                q.offer(point);
            }
        }
        return k > v ? -k : v;
    }
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int y = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        
        map = new String[y];
        for(int _y = 0; _y < y; _y++){
            map[_y] = br.readLine();
        }
       
        visited = new boolean[y][x];
        
        int v = 0;
        int k = 0;
        for(int i = 0; i < y; i++){
            for(int j = 0; j < x; j++){
                if(visited[i][j]) continue;
                int out = T.BFS(j, i);
                
                if(out < 0){
                    k += Math.abs(out);
                }
                else{
                    v += out;
                }
            }
        }
        
        System.out.println(k + " " + v);
    }
}

