import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int answer = 0;
		
		int[] score = new int[N+1];
		int[][] max = new int[N+1][2];
		
		for(int i = 1; i<=N; i++) {
			int s = Integer.parseInt(br.readLine());
			score[i] = s;
		}
        
        max[1][0] = score[1];
		max[1][1] = 0;
		
        if(N > 2) {
		    max[2][0] = max[1][0] + score[2];
		    max[2][1] = max[1][1] + score[2];
            
		    for(int i = 3; i <= N; i++) {
			    max[i][1] = Math.max(max[i-2][0], max[i-2][1]) + score[i]; // 2번째이전 계단에서 올라오는 경우
			    max[i][0] = max[i-1][1] + score[i];
		    }
		
		    answer = Math.max(max[N][0], max[N][1]);
		    
        } 
        else {
            if(N == 2) {
                max[2][0] = max[1][0] + score[2];
		        max[2][1] = max[1][1] + score[2];
            }
            
            answer = Math.max(max[N][0], max[N][1]);
        }
        System.out.println(answer);
	}
}
