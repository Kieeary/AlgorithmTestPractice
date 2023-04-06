import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	static class Point {
		int x;
		int y;
		int z;
		
		public Point(int x, int y, int z) {
			this.x = x;
			this.y = y;
			this.z = z;
		}
	}
	
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	static int[] dz = {1, -1};
	static int answer = -1;
	
	static Queue<Point> q = new LinkedList<>();
	
	static void BFS(int[][][] arr) {
		
		while(!q.isEmpty()) {
			int len = q.size();
			
			answer++;
			
			for(int i =0; i<len; i++) {
				Point p = q.poll();				
				//이차원 좌표의 상하좌우 확인
				for(int j =0; j<4; j++) {
					int nx = p.x + dx[j];
					int ny = p.y + dy[j];
					
					if(nx >= 0 && ny >=0 && nx < arr[0][0].length && ny < arr[0].length && arr[p.z][ny][nx] == 0) {
						arr[p.z][ny][nx] = 1;
						q.add(new Point(nx, ny, p.z));
					}
				}
				
				//삼차원 좌표의 위아래 확인
				for(int j = 0; j<2; j++) {
					int nz = p.z + dz[j];
					
					if(nz >= 0 && nz < arr.length && arr[nz][p.y][p.x] == 0) {
						arr[nz][p.y][p.x] = 1;
						q.add(new Point(p.x, p.y, nz));
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		int H = sc.nextInt();
		
		boolean flag = true;
		
		int[][][] arr = new int[H][N][M];
		List<Point> l = new ArrayList<>();
		
		// 토마토 상태 && 익은 토마토 큐에 넣기
		for(int i = 0; i<H; i++) {
			for(int j =0; j<N; j++) {
				for(int s = 0; s<M; s++) {
					arr[i][j][s] = sc.nextInt();
					if(arr[i][j][s] == 1) {
						q.add(new Point(s, j, i));
					}
					else if(arr[i][j][s] == 0)	l.add(new Point(s,j,i));
				}
			}
		}
		
		BFS(arr);
		
		for(int i= 0; i<l.size(); i++) {
			Point p = l.get(i);
			
			if(arr[p.z][p.y][p.x] == 0)	{
				flag = false;
				break;
			}
		}
		if(!flag)	answer = -1;
		
		System.out.println(answer);
	}

}
