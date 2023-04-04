import java.util.Scanner;

public class Main{
    
	static int[] dx = {0, 1, 0, -1};
    static int[] dy = {-1, 0, 1, 0};
    
    static int[][] maps;    
    static int answer = 0;
    
    public static void DFS(int r, int c, int d) {
    	
        if(maps[r][c] == 0)    {
        	//System.out.println(r + ", " + c);
            maps[r][c] = -1;
            answer++;
        }
        
        // 4방향 탐색
        for(int i = 0; i<4; i++) {
            int nx = c + dx[(d-i+3) % 4];
            int ny = r + dy[(d-i+3) % 4];
            
            //System.out.println(+ nx + ", " + ny);
            
            if(nx >= 0 && ny >= 0 && nx<101 && ny <101 && maps[ny][nx] == 0) {
            	//System.out.println("방향: " + (d-i+3) % 4);
                DFS(ny, nx, (d-i+3) % 4);
                //System.out.println("리턴됨");
                return;
            }
        }
        
        // 여기를 왔다는 것은 4방향 탐색을 했을때 갈 공간이 없었다는 것, 후진을 일단 해야됨
        	int nx = c + dx[(d+2)%4];
        	int ny = r + dy[(d+2)%4];
        	if(nx >= 0 && ny >= 0 && nx <101 && ny < 101 && maps[ny][nx] != 1)	{
        		DFS(ny, nx, d);
        	}

    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        maps = new int[N][M];
        
        int r = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        // maps 생성
        for(int i = 0; i<N; i++) {
            for(int j =0; j<M; j++) {
                maps[i][j] = sc.nextInt();
            }
        }
        
        // 시작점에서 시작
        DFS(r, c, d);
        
        System.out.println(answer);
    }
}