import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Point {
    int x;
    int y;
    
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class Main{ 
    
    static int dx[] = {1,-1, 0, 0};
    static int dy[] = {0,0,1,-1};
    static Queue<Point> q1 = new LinkedList<>();
    static int map[][];
    static int[][] ch;
    
    static int BFS(int L, int N, int M) {
        
        while(!q1.isEmpty()){
            int len = q1.size();            
            L++;
            
            for(int i=0; i<len; i++) {
                Point p = q1.poll();
                map[p.y][p.x] = 0;
                for(int s =0; s<4; s++){
                    int nx = p.x + dx[s];
                    int ny = p.y + dy[s];
                                        
                    if(nx == M && ny == N) {
                    	return L+1;
                    }
                    if(nx > 0 && ny > 0 && nx <= M && ny <= N && map[ny][nx] == 1) {
                       if(ch[ny][nx] == 0 || ch[ny][nx] > L+1) {
                          
                          q1.add(new Point(nx, ny));
                          ch[ny][nx] = L+1;
                          map[ny][nx] = 0;
                          
                       }
                    }
                }
            }
        }
        return 0;
    }
    
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int N = Integer.parseInt(line[0]);
        int M = Integer.parseInt(line[1]);
        map = new int[N+1][M+1];
        ch = new int[N+1][M+1];
        
        for (int i = 1; i <= N; i++) {  
            line = br.readLine().split("");
            for (int j = 1; j <= M; j++) {
                map[i][j] = Integer.parseInt(line[j-1]);
            }
        }
        
        int L = 1;
        map[1][1] = 0;
        for(int i =0; i<4; i++){
            int nx = dx[i] +1;
            int ny = dy[i] +1;
            
            if(nx >=1 && ny >= 1 && nx <=M && ny <= N && map[ny][nx] == 1){
                q1.add(new Point(nx, ny));
            }
        }
        System.out.println(BFS(L, N, M));
        
    }
}