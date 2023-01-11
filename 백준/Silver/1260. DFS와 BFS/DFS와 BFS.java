import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Main{
    
    static Queue<Integer> queue = new LinkedList<>();
    
    static int n;
    static int m;
    static int f;
    
    static void DFS(int f, int[][] arr, int[] Dch) {
        
        for(int i = 1; i<=n; i++){
            if((arr[f][i] == 1 || arr[i][f]==1) && Dch[i] != 1) {
                Dch[i] = 1;
                System.out.print(i + " ");
                DFS(i, arr, Dch);
            } 
        }
        
        return;
    }
    
    static void BFS(int f, int[][] arr, int[] Bch) {
        
        while(!queue.isEmpty()) {
            int len = queue.size();
                        
            for(int i = 0; i<len; i++) {
                int tmp = queue.poll();
                
                
                for(int j = 1; j<=n; j++) {
                    if((arr[tmp][j] == 1 || arr[j][tmp] == 1) && Bch[j] != 1) {
                        Bch[j] = 1;
                        System.out.print(j + " ");
                        queue.add(j);
                    }
                }
            }
            
        }
    }
    
  public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        m = sc.nextInt();
        f = sc.nextInt();
        
        int[][] arr = new int[n+1][n+1];
        int[] Dch = new int[n+1];
        int[] Bch = new int[n+1];
        
        for(int i =0; i<m; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            
            arr[l][r] = 1;
            arr[r][l] = 1;
        }
        
        Dch[f] = 1;
        System.out.print(f +" ");
        DFS(f, arr, Dch);
        
        System.out.println();
        
        Bch[f] = 1;
        System.out.print(f + " ");
        queue.add(f);
        BFS(f, arr, Bch);
        
        
    }
}