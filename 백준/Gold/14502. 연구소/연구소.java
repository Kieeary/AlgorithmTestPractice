import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Point2{
	int x;
	int y;
	
	public Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Main {
	
	public static int BFS(int[][] arr) {
		
		int[][] copy_arr = new int[N][M];
		int tmp_ans = 0;
		
		// 2로 변경하기 위한 복사 코드
		for(int i =0; i<N; i++) {
			for(int j =0; j<M; j++) {
				copy_arr[i][j] = arr[i][j];
			}
		}
	
		while(!q.isEmpty()) {
			int len = q.size();
			
			for(int i =0; i<len; i++) {
				Point2 point = q.poll();
				
			//	System.out.println("뭐가 나오지? " + point.y + ", " + point.x);
				
				for(int j =0; j<4; j++) {
					int nx = dx[j] + point.x;
					int ny = dy[j] + point.y;
					
					if(nx < M && ny < N && ny >= 0 && nx >= 0 && ch[ny][nx] == 0 && copy_arr[ny][nx] == 0) {
						copy_arr[ny][nx] = 2;
//						System.out.println("여기서 1로 바꿔야하는데, " + ny + ", " + nx);
						ch[ny][nx] = 1;
						tmp_ans++;
						
						q.add(new Point2(nx, ny));
					}
				}
			}
		}
		
		return tmp_ans;
		
	}
	
	public static int DFS(int wall_cnt, int[][] arr) {
		
		if(wall_cnt == 3)	{
	//		System.out.println("---------------");
			
			for(int i = 0; i<N; i++) {
				for(int j = 0; j<M; j++) {
					ch[i][j] = 0;
				}
			}
			
			int t_answer = 0;
			for(int i =0; i<N; i++) {
				for(int j = 0; j<M; j++) {
					if(arr[i][j] == 2 && ch[i][j] == 0) {
//						System.out.println("들어온 좌표: " + i + ", " + j);
						q.add(new Point2(j, i));
						ch[i][j] = 1;
						t_answer += BFS(arr);
					}
				}
			}
	//		System.out.println(t_answer);
	//		System.out.println("================");
			answer = Math.min(answer, t_answer);
//			System.out.println("임시 답은 : " + answer);
			
		}
		
		else {
			for(int i =0; i<N; i++) {
				for(int j =0; j<M; j++) {
					if(arr[i][j] == 0) {
			//			System.out.println("벽을 세운 것 : " + i + ", " + j);
						arr[i][j] = 1;
						wall_cnt++;
						DFS(wall_cnt, arr);
			//			System.out.println("없어진 벽: " + i + ", " + j);
						arr[i][j] = 0;
						wall_cnt--;
					}
				}
			}
		}
		return answer;
	}

	static int N;
	static int M;
	static Queue<Point2> q = new LinkedList<>();
	static int[] dx = {1,-1,0,0};
	static int[] dy = {0,0,1,-1};
	static int answer = Integer.MAX_VALUE;
	static int[][] ch; 
	
	public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        N = Integer.parseInt(line[0]);
        M = Integer.parseInt(line[1]);
        int wall_cnt = 0;
        int count = 0;
        
        int[][] arr = new int[N][M];
        ch = new int[N][M];
        
        // 입력
        for (int i = 0; i < N; i++) {  
            line = br.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(line[j]);
            }
        }
        
        for (int i = 0; i < N; i++) {  
            for (int j = 0; j < M; j++) {
            	if(arr[i][j] == 1 || arr[i][j] == 2)	count++;
            }
        }
        
        // DFS를 통해 벽 세우기
        
        int tmp = DFS(wall_cnt, arr);
        
        count = tmp + count + 3;
        int total = (M * N) - count; 
        System.out.println(total);
        
	}

}
