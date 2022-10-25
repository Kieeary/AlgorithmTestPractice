import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        String[] arr = new String[strings.length];
        
        for(int i = 0; i<strings.length; i++) {
            String ch = String.valueOf(strings[i].charAt(n));
            String tmpAns = ch + strings[i];
            answer[i] = tmpAns;
        }
        
        Arrays.sort(answer);
        
        for(int i =0; i<answer.length; i++) {
            answer[i] = answer[i].substring(1); 
        }
        
        return answer;
    }
}