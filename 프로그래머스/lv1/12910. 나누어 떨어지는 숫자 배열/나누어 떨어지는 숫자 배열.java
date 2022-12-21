import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
       
        ArrayList<Integer> al = new ArrayList<>();
        int cnt = 0;
        
        for(int i =0; i<arr.length; i++) {
            if(arr[i] % divisor == 0) {
                al.add(arr[i]);
                cnt++;
            }
        }
        int[] answer;
        
        if(cnt > 0) {
        answer = new int[al.size()];
        
        for(int i = 0; i<al.size(); i++) {
            answer[i] = al.get(i);
        }
        
        Arrays.sort(answer);
        } else {
            answer = new int[1];
            answer[0] = -1;
        }
        
        
        return answer;
    }
}