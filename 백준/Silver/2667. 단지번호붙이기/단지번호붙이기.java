import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point{
	
	int x;
	int y;
	
	public Point(int y, int x) {
		this.x = x;
		this.y = y;
	}
}


class Main {
	
	static Queue<Point> q = new LinkedList<>();
	static ArrayList<Integer> al = new ArrayList<>();
	static int[] dx = {1,-1,0,0};
	static int[] dy = {0,0,1,-1};
	static int cnt = 0;
	
	static void BFS(int lt, int rt, int[][]arr, int[][]ch) {
		
		while(!q.isEmpty()) {

			int len = q.size();

			for(int l = 0; l<len; l++) {
				Point p = q.poll();
			for(int i =0; i<4; i++) {
				
				int ny = dy[i] + p.y;
				int nx = dx[i] + p.x;
				
				if(arr[ny][nx] == 1 && ch[ny][nx] == 0) {
					arr[ny][nx] = 0;
					ch[ny][nx] = 1;
					cnt++;
					q.add(new Point(ny, nx));
				}
			}
		
		}
	}
			
	}
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[][] arr = new int[N+2][N+2];
        int[][] ch = new int[N+2][N+2];
        
        for(int i = 1; i<= N; i++){
            String str = sc.next();
            
            for(int j = 1; j<=N; j++) {
            	arr[i][j] = str.charAt(j-1) - '0';
            }
            
        }
       
        
        for(int i = 1; i<= N; i++) {
        	for(int j = 1; j<= N; j++) {
        		cnt = 0;
        		if(arr[i][j] == 1 && ch[i][j] == 0) {
        			q.add(new Point(i,j));
        			arr[i][j] = 0;
        			ch[i][j] = 1;
        			cnt++;
        			BFS(i, j, arr, ch);
        			al.add(cnt);
        		}
        	}
        }
       
        System.out.println(al.size());
        
        int[] sortArr = new int[al.size()];
        
        
        for(int i = 0; i<al.size(); i++) {
        	sortArr[i] = al.get(i);
        }
        
        Arrays.sort(sortArr);
        
        for(int i = 0; i<sortArr.length; i++) {
        	System.out.println(sortArr[i]);
        }

        
        
    }
}