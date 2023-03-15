import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	
	static int N;
	static int[][] arr;
	static Queue<Integer> q = new LinkedList<>();
	static int answer = -1;

	public static void BFS(int target, int cnt) {
		// 일촌 관계인 경우
		if(q.peek() == target)	{
			cnt++;
			answer = cnt;
			return;
		}
		
		// 그 외의 경우
		else {
			while(!q.isEmpty()) {
				cnt++;
				int len = q.size();
			
				for(int i = 0; i<len; i++) {
					int idx1 = q.poll();
					
					for(int j = 1; j <= N; j++) {
						
						//연결되어 있는 경우
						if(arr[idx1][j] == 1) {
							arr[idx1][j] = 0;
							arr[j][idx1] = 0;
							
							if(j == target)	{
								answer = cnt+1;
								return;
							} else {
								q.add(j);
							}
						}
					}
				}
			}
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		arr = new int[N+1][N+1];
		
		String[] line = br.readLine().split(" ");
		
		int start = Integer.parseInt(line[0]);
		int target = Integer.parseInt(line[1]);
		int cnt = 0;
		
		int r = Integer.parseInt(br.readLine());
		
		// 촌수 관계 설정
		for(int i = 0; i<r; i++) {
			line = br.readLine().split(" ");
			
			int idx1 = Integer.parseInt(line[0]);
			int idx2 = Integer.parseInt(line[1]);
			arr[idx1][idx2] = 1;
			arr[idx2][idx1] = 1;
		}
		
		for(int i = 1; i<=N; i++) {
			// 서로 연결되어있는 경우
			if(arr[start][i] == 1) {
				arr[start][i] = 0;
				arr[i][start] = 0;
				
				q.add(i);
				BFS(target, cnt);
			}
		}
		
		System.out.println(answer);
		
	}
}