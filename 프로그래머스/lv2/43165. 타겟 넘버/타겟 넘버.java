import java.util.*;

class Solution {
    
    static Queue<Integer> q = new LinkedList<>();
    static int answer = 0;
    
    static void BFS(int L, int len, int target, int[] numbers){
        
        while(!q.isEmpty()) {
            L++;
            int size = q.size();
            for(int i =0; i<size; i++)  {
                int sum = q.poll();
                    
                if(L == len){ 
                    if(sum == target)   answer++;
                   continue;
                } else {
                
                for(int j =0; j<2; j++) {
                    if(j%2 == 0) {
                        int tmpSum = sum + numbers[L];
                        q.add(tmpSum);
                        } else {
                        int tmpSum = sum - numbers[L];
                        q.add(tmpSum);
                        }   
                }
            }
            }
                
        }
        
    }
    
    public int solution(int[] numbers, int target) {
        int L = 0;
        int len = numbers.length;

        q.add(numbers[0]);
        q.add(numbers[0] * (-1));
        
        BFS(L, len, target, numbers);
        
        return answer;
    }
}