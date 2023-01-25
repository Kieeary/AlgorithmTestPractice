import java.util.Scanner;

class Main {

	static int answer = 0;
	static int N;

	static void DFS(int[][] arr, int u, int v) {
		arr[u][v] = 0;
		arr[v][u] = 0;

		for (int j = 1; j <= N; j++) {
			if (arr[v][j] == 1) {
//				System.out.println("y2, x2 :" + v + ", " + j);
				DFS(arr, v, j);
			}
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		int M = sc.nextInt();

		int[][] arr = new int[N + 2][N + 2];

		// 그래프 관계 설정
		for (int i = 0; i < M; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();

			arr[u][v] = 1;
			arr[v][u] = 1;
		}
		
		for(int i = 1; i<=N; i++) {
			arr[i][i] = 1;
		}

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				if (arr[i][j] == 1) {
//					System.out.println("y, x :" + i + ", " + j);
					answer++;
					DFS(arr, i, j);
				}
			}
		}

		System.out.println(answer);
	}
}