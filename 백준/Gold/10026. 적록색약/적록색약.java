import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Info {
	int x;
	int y;
	char c;

	public Info(int x, int y, char c) {
		this.x = x;
		this.y = y;
		this.c = c;
	}
}

public class Main {

	static int N;

	static int[] dx = { 0, 0, 1, -1 };
	static int[] dy = { 1, -1, 0, 0 };

	static Queue<Info> q = new LinkedList<>();

	public static void BFS(char[][] arr, int[][] ch) {

		while (!q.isEmpty()) {
			int len = q.size();
			for (int i = 0; i < len; i++) {
				Info info = q.poll();
				char tmp = info.c;

				for (int j = 0; j < 4; j++) {
					int nx = info.x + dx[j];
					int ny = info.y + dy[j];

					if (nx >= 0 && ny >= 0 && nx < N && ny < N && tmp == arr[ny][nx] && ch[ny][nx] == 0) {
						q.add(new Info(nx, ny, arr[ny][nx]));
						ch[ny][nx] = 1;
					}
				}
			}

		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());

		char[][] arr = new char[N][N];
		char[][] arr2 = new char[N][N];
		int[][] ch = new int[N][N];

		int ans1 = 0;
		int ans2 = 0;

		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0; j < N; j++) {
				arr[i][j] = str.charAt(j);
				if (str.charAt(j) == 'R')
					arr2[i][j] = 'G';
				else
					arr2[i][j] = str.charAt(j);
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (ch[i][j] == 0) {
					q.add(new Info(j, i, arr[i][j]));
					ch[i][j] = 1;
					BFS(arr, ch);
					ans1++;
				}
			}
		}
		
		ch = new int[N][N];
		
		for(int i =0; i<N; i++) {
			for (int j = 0; j < N; j++) {
				if (ch[i][j] == 0) {
					q.add(new Info(j, i, arr2[i][j]));
					ch[i][j] = 1;
					BFS(arr2, ch);
					ans2++;
				}
			}
		}

		System.out.println(ans1 + " " + ans2);

	}

}
