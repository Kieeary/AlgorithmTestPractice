import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Main{
	
    static Queue<Integer> queue = new LinkedList<>();
    static int answer = 0;
    static int n;
    
    static int BFS(int[][] arr, int[] ch) {
        
        while(!queue.isEmpty()) {
            
            int len = queue.size();
            for(int i =0; i<len; i++) {
                int tmp = queue.poll();
                
                for(int j =1; j<=n; j++) {
                    if((arr[tmp][j] == 1 || arr[j][tmp] == 1)  && ch[j] == 0) {
                        queue.add(j);
                        ch[j] = 1;
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
 
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
       n = sc.nextInt();
        int cnt = sc.nextInt();
        int[][] arr = new int[n+1][n+1];
        int[] ch = new int[n+1];
        
        for(int i = 0; i<cnt; i++) {
            int li = sc.nextInt();
            int ri = sc.nextInt();
            arr[li][ri] = 1;
            arr[ri][li] = 1;
        }
        
        queue.add(1);
        ch[1] = 1;
        
        System.out.println(BFS(arr, ch));
    }
}