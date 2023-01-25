class Solution {
    
    static int[][] arr;
    static int[] ch;
    static int[] cost;
    
    static void DFS(int i, int K, int sum) {
        
        System.out.println("d");
        for(int j = 1; j<= arr.length-2; j++) {
            if(K < sum + arr[i][j]) continue;
            if(cost[j] > sum+arr[i][j] && ch[j] == 0 && arr[i][j] != 0) {
                ch[j] = 1;
                DFS(j, K, sum + arr[i][j]);
                cost[j] = Math.min(cost[j], sum + arr[i][j]);
                ch[j] = 0;
            } 
        }
    }
    
    public int solution(int N, int[][] road, int K) {
        
        arr = new int[N+2][N+2];
        ch = new int[N+1]; // 방문 여부
        cost = new int[N+1]; // 각 집별 거리 비용
        
        int sum = 0;
        
        // 관계를 이차원 배열로 표현
        for(int i = 0; i<road.length; i++) { 
            if(arr[road[i][0]][road[i][1]] == 0 || 
               arr[road[i][1]][road[i][0]] == 0) {
                arr[road[i][0]][road[i][1]] = road[i][2];
                arr[road[i][1]][road[i][0]] = road[i][2];
            } else {
                if(arr[road[i][0]][road[i][1]] > road[i][2]) {
                arr[road[i][0]][road[i][1]] = road[i][2];
                arr[road[i][1]][road[i][0]] = road[i][2];
                }
            }
        }
        
        for(int i =1; i<=N; i++) {
            cost[i] = 500001;
        }
        
        ch[1] = 1;
        cost[1] = 0;
        
        for(int i = 1; i<=N; i++) {
            if(arr[1][i] != 0 && arr[1][i] <= K) {
                ch[i] = 1;
                cost[i] = Math.min(cost[i], arr[1][i]);
                DFS(i, K, sum + arr[1][i]);
                ch[i] = 0;
            }
        }
        
        int answer = 0;
        
        for(int i =1; i<ch.length; i++) {
            if(cost[i] <= K)    answer++;
        }
        
        return answer;
    }
}