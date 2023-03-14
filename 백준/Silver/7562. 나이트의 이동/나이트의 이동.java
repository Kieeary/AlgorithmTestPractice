import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Point10{
	int x;
	int y;
	
	public Point10(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Main {
	
	static void BFS(int target_y, int target_x, int[][] ch, int cnt) {
		while(!q.isEmpty()) {
			
			int len = q.size();
			cnt++;
			
			for(int i = 0; i<len; i++) {
				Point10 p = q.poll();
				
				if(p.x == target_x && p.y == target_y)	{
					answer = cnt;
					return;
					
				} else {
					for(int j = 0; j<8; j++) {
						int nx = p.x + dx[j];
						int ny = p.y + dy[j];
												
						if(nx >=0 && ny >= 0 && nx < ch.length && ny < ch.length && ch[ny][nx] == 0) {
							ch[ny][nx] = 1;
							q.add(new Point10(nx, ny));
						}
					}
				}
			}
		}
	}

	// 움직이는 좌표 정리
	static int[] dy = { -1, -2, 1, 2, -2, -1, 2, 1 };
	static int[] dx = { -2, -1, -2, -1, 1, 2, 1, 2 };
	
	static int answer = 0;
	static int N;
	
	static Queue<Point10> q = new LinkedList<>();
	static ArrayList<Integer> al = new ArrayList<>();

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			
			answer = 0;

			int l = Integer.parseInt(br.readLine());
			int[][] arr = new int[l][l];
			int[][] ch = new int[l][l];
			

			String[] line = br.readLine().split(" ");

			int start_y = Integer.parseInt(line[0]);
			int start_x = Integer.parseInt(line[1]);

			line = br.readLine().split(" ");

			int target_y = Integer.parseInt(line[0]);
			int target_x = Integer.parseInt(line[1]);

			int cnt = -1;
			ch[start_y][start_x] = 1;
			q.add(new Point10(start_x, start_y));
			BFS(target_y, target_x, ch, cnt);
            
            // target 숫자를 만났을때 바로 리턴되기 때문에 queue에 좌표가 남아있을 수 있다.	
			while(!q.isEmpty()) {
				q.poll();
			}

			al.add(answer);
		}
		
		for(int i = 0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}

	}
}
