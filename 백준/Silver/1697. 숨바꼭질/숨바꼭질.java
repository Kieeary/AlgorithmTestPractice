import java.util.*;

class Main {
    
    static Queue<Integer> q = new LinkedList<>();
    static int visited[] = new int[100001];
    static int K;
    
    static int BFS(int L) {
        while(!q.isEmpty()) {
            L++;
            
            int len = q.size();
            
            for(int i =0; i<len; i++) {
                int val = q.poll();
                
                if(val == K)    return L;
                else {
                    if(val + 1 >= 0 && val + 1 < 100001 && visited[val+1] == 0) {
                        q.add(val + 1);
                        visited[val+1] = 1;
                    }
                    if(val - 1 >= 0 && val - 1 < 100001 && visited[val-1] == 0) {                   
                        q.add(val - 1);
                        visited[val-1] = 1;
                    }
                    if(val * 2 >= 0 && val * 2 < 100001 && visited[val * 2] == 0) {
                        q.add(val * 2);
                        visited[val * 2] = 1;
                    }
                }
            }
            }
        return 0;
        }
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        K = sc.nextInt();
        
        int L = -1;
        
        visited[N] = 1;
        q.add(N);
       
        System.out.print(BFS(L));
    }
}
