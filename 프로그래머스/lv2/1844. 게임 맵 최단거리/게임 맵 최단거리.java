import java.util.*;

class Solution {
    
    static int[][] ch;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static boolean flag = false;
    static int L = 1;
    
    static Queue<Point> q = new LinkedList<>();
    
    static class Point {
        int x;
        int y;
        
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    
    static void BFS(int[][] maps) {
        
        while(!q.isEmpty()) {
            L++;
            
            int len = q.size();
            
            for(int i =0; i<len; i++) {
                Point p = q.poll();
                            
                if(p.x == maps[0].length-1 && p.y == maps.length-1) {
                    flag = true;
                    return;
                } else {
                
                for(int s =0; s<4; s++){
                    int nx = dx[s] + p.x;
                    int ny = dy[s] + p.y;
                    
                    if(nx >= 0 && ny >= 0 && nx < maps[0].length && ny < 
                       maps.length && maps[ny][nx] == 1 && ch[ny][nx] == 0) {
                        
                        ch[ny][nx] = 1;
                        q.add(new Point(nx, ny));
                    }
                }
            }
            }
        }
    }
    
    public int solution(int[][] maps) {
        
        int answer = -1;
        ch = new int[maps.length][maps[0].length];
        
        if(maps.length == 1 && maps[0].length == 1){
            return 1;
        }
        
        ch[0][0] = 1;
        for(int i =0; i<4; i++) {
            int nx = 0 + dx[i];
            int ny = 0 + dy[i];
            
            if(nx >= 0 && ny >= 0 && nx < maps[0].length && ny < maps.length
              && maps[ny][nx] == 1 && ch[ny][nx] == 0) {
                
                ch[ny][nx] = 1;
                q.add(new Point(nx, ny));
                
            }
        }
        
        BFS(maps);
        
        if(flag)    answer = L;
        else answer = -1;
        
        return answer;
    }
}