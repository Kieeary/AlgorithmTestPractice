import java.util.*;

class Solution {
    
    static int[][] graph;
    static int L = 0;
    static Queue<Integer> q = new LinkedList<>();
    
    static class Point {
        int x;
        int y;
        
        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    
    static void BFS(int[][] computers) {
        
        L++;
        
        while(!q.isEmpty()) {
            
            int len = q.size();
            int lt = q.poll();
            
            for(int i = 0; i<len; i++) {
                
                for(int s = 0; s < computers.length; s++) {
                    if(computers[lt][s] == 1){
                        computers[lt][s] = 0;
                        computers[s][lt] = 0;
                        
                        q.add(s);
                    } 
                }
            }
        }
    }
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        int len = computers.length;
        
        graph = new int[len][len];
        
        // 연결관계 그래프 생성 (만들 필요 없었음)
        // for(int i = 0; i<computers.length; i++) {
        //     for(int j =0; j<computers.length; j++) {
        //         if(computers[i][j] == 1){
        //             graph[i][j] = 1;
        //             graph[j][i] = 1;
        //         }
        //     }
        // }
        
        for(int i = 0; i<len; i++){
            for(int j =0; j<len; j++) {
                if(computers[i][j] == 1) {
                    computers[i][j] = 0;
                    computers[j][i] = 0;
                    
                    //q.add(new Point(i, j));
                    q.add(j);
                    BFS(computers);
                }
            }
        }
        
        answer = L;
        
        return answer;
    }
}