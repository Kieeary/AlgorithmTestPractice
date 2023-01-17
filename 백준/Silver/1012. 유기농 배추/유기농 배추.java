import java.util.Scanner;

public class Main{
    
    static int M;
    static int N;
    static int K;
    static int answer = 0;
    static boolean flag = false;
    
    static int[] dy = {1,-1,0,0};
    static int[] dx = {0,0,1,-1};
    
    static void DFS(int lt, int rt, int[][] arr, int[][] ch) {

    	if(arr[lt][rt] == 1 && ch[lt][rt] == 0) {
    		answer++;
    		arr[lt][rt] = 0;
    		ch[lt][rt] = 1;
    		
    		for(int i = 0; i<4; i++) {
    			
    			int ny = dy[i] + lt;
    			int nx = dx[i] + rt;
    			
    			if(arr[ny][nx] == 1 && ch[ny][nx] == 0) {
    				answer--;
    				DFS(ny, nx, arr, ch);
    			}
    		}
    		
    	}
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        int ans[] = new int[T];

        
        for(int i = 0; i<T; i++) {
            
            M = sc.nextInt();
            N = sc.nextInt();
            K = sc.nextInt();
        
            int[][] arr = new int[N+2][M+2];
            int[][] ch = new int[N+2][M+2];
            
            for(int j=0; j<K; j++) {
                int rt = sc.nextInt();
                int lt = sc.nextInt();
                
                rt++;
                lt++;
                
                arr[lt][rt] = 1;
            }
            
            for(int s = 1; s<=N; s++) {
            	for(int c = 1; c<=M; c++) {
            		DFS(s,c , arr, ch);
            	}
            }
            
            System.out.println(answer);
            answer = 0;
            
        }
    }
}