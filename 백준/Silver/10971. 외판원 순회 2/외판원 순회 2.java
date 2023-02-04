import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class Main {
    
    static int[] ch;
    static int[][] arr;
    static int N;
    static int min = Integer.MAX_VALUE;
    static int answer = Integer.MAX_VALUE;
    
    static void DFS(int lt, int L, int first, int sum) {
    	if(L == N) {
    		
    		// 내가 출발한 경로로 다시 돌아갈 수 없는 경우 그냥 리턴
    		if(arr[lt][first] == 0)	return;
    		
    		// 다시 돌아갈 수 있으면 총 순회 값을 더하여 기존의 순회 값과 비교하여 더 작은 값을 answer에 저장
    		else {
    			answer = Math.min(sum + arr[lt][first], answer);
    			return;
    		}
    	} else {
    		for(int i = 0; i<N; i++) {
    			if(arr[lt][i] != 0 && ch[i] == 0) {
    				ch[i] = 1;
    				DFS(i, L+1, first, sum + arr[lt][i]);
    				ch[i] = 0;
    			}
    		}
    	}
    }
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        ch = new int[N];

        arr = new int[N][N];
        
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        for(int i = 0; i<N; i++) {
        	int sum = 0; // 임시 합
        	int L = 1; // 레벨
        	ch[i] = 1; // 방문 표시
        	for(int j =0; j<N; j++) {
        		if(arr[i][j] != 0 && ch[j] == 0) {
        			ch[j] = 1;
        			DFS(j, L + 1, i, sum + arr[i][j]);
        			ch[j] = 0;
        		}
        	}
        	ch[i] = 0;
        }
       
        System.out.print(answer);
        
    }
}