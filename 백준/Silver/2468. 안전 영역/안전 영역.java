import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Point3 {
	int x;
	int y;

	public Point3(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Main {

	static void BFS(int[][] copy_arr, int height, int[][] ch) {

		while (!q.isEmpty()) {
			int len = q.size();

			for (int i = 0; i < len; i++) {
				Point3 point = q.poll();
				for (int j = 0; j < 4; j++) {
					int nx = point.x + dx[j];
					int ny = point.y + dy[j];
					
					if(nx >= 0 && ny >= 0 && nx < N && ny < N && copy_arr[ny][nx] > 0 && ch[ny][nx] == 0) {
						ch[ny][nx] = 1;
						q.add(new Point3(nx, ny));
					}
				}
			}
		}
	}

	static void copy(int height) {

		int[][] copy_arr = new int[N][N];
		int[][] ch = new int[N][N];

		// 기존의 배열 깊은 복사
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				copy_arr[i][j] = arr[i][j];
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (copy_arr[i][j] <= height) {
					copy_arr[i][j] = 0;
				}
			}
		}		

		int tmp_answer = 0;
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (copy_arr[i][j] != 0 && ch[i][j] == 0) {
					ch[i][j]= 1;
					q.add(new Point3(j, i));
					BFS(copy_arr, height, ch);
					tmp_answer++;
				}
			}
		}
		answer = Math.max(answer, tmp_answer);
	}

	static int[][] arr;
	static int N;
	static Queue<Point3> q = new LinkedList<>();

	static int dx[] = { 1, -1, 0, 0 };
	static int dy[] = { 0, 0, 1, -1 };
	
	static int tmp = 0;
	
	static int answer = 0;

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());

		arr = new int[N][N];

		// 입력
		for (int i = 0; i < N; i++) {
			String[] line = br.readLine().split(" ");
			for (int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(line[j]);
			}
		}

		for (int i = 0; i <= 100; i++) {
			copy(i);
		}
		
		System.out.print(answer);
	}
}