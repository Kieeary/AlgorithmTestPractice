class Solution {
    
    static int max = Integer.MIN_VALUE;
    static int answer = 0;
    static boolean flag = false;
    
    void DFS(int k, int[][] dungeons, int L, int[] ch) {
  
        // System.out.println(L);
        // System.out.println(max);

        if(flag == false) {
        if(L > max) {
            answer = L;
            max = L;
        }
        if(L == dungeons.length) {
            answer = L;
            flag = true;
            return;
        }
        else {
            for(int i = 0; i<dungeons.length; i++) {
                if(flag == false){
                if(ch[i] == 0 && k >= dungeons[i][0]){
                    ch[i] = 1;
                    DFS(k-dungeons[i][1], dungeons, L+1, ch);
                    ch[i] = 0;
                }
            } else return;
            }
        }
    } else return;
    }
             
        //     for(int i = 0; i<dungeons.length; i++) {
        //         if(flag == false){
        //         if(ch[i] == 0 && k >= dungeons[i][0]){
        //             ch[i] = 1;
        //             DFS(k-dungeons[i][1], dungeons, L+1, ch);
        //             ch[i] = 0;
        //         }
        //     } else return;
        //     }
        // }
        // }  
            
    
    public int solution(int k, int[][] dungeons) {
        
        int L = 0;        
        int[] ch = new int[dungeons.length];
        
        for(int i = 0; i< dungeons.length; i++) {
            if(flag == false && ch[i] == 0 && k >= dungeons[i][0]) {
                ch[i] = 1;
                DFS(k-dungeons[i][1], dungeons, L+1, ch);
                ch[i] = 0;
            }
        }
        
        return answer;
    }
}