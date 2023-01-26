import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point{
	int x;
  	int y;
  
  public Point(int x, int y) {
  	this.x = x;
    this.y = y;
  }
}

public class Main {
  
  static int[] dx = {1, -1, 0, 0};
  static int[] dy = {0, 0, 1, -1};
  static int L = -1;
  static int N;
  static int M;
  static boolean flag = true;
  
  static int[][] arr;
  
  static Queue<Point> q = new LinkedList<>();
  
  static void BFS(Point p){
  
  	while(!q.isEmpty()) {
    	int len = q.size();
      	L++;
      
      for(int i =0; i<len; i++) {
          Point nP = q.poll();
  //        System.out.println("큐에서 꺼낸 좌표: " + nP.y + ", " + nP.x);

      	for(int j = 0; j<4; j++) {
        	int nx = dx[j] + nP.x;
          	int ny = dy[j] + nP.y;
          
          	if(nx > 0 && ny > 0 && nx < M+1 && ny < N+1) {
            	if(arr[ny][nx] == 0) {
                	arr[ny][nx] = 1;
                  	q.add(new Point(nx, ny));
       //           	System.out.println("1로 변하는 좌표: " + ny +", " + nx);
                }
            }
        }
      }
    }
  }
  
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    M = in.nextInt(); //x좌표
    N = in.nextInt(); //y좌표
    
    arr = new int[N+2][M+2];
    
    for(int i =1; i<=N; i++) {
    	for(int j = 1; j<=M; j++) {
        	arr[i][j] = in.nextInt();
          	if(arr[i][j] == 1) {
            	q.add(new Point(j, i));
   //           	System.out.println("맨 처음 1인 좌: " + i +", " + j);
            }
        }
    }
    
    BFS(q.peek());
    
    for(int i =1; i <= N; i++) {
    	for(int j=1; j<= M; j++) {
    		if(arr[i][j] == 0)	{
    			flag = false;
    			break;
    		}
          if(flag == false)	break;
    	}
    }
    
    if(flag)	System.out.println(L);
    else System.out.println("-1");
    return ;
  }
}