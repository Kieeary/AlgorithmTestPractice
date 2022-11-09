import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        
        for(int i =0; i<participant.length; i++) { // 이름이 나온 횟수가 저장
            hm.put(participant[i], 
                   hm.getOrDefault(participant[i], 0) +1);
        }
        
        for(String str : hm.keySet()) {
            System.out.println(hm.get(str));
            //if(hm.get(str) > 0)    answer = str;
        }
        
        for(int i =0; i<completion.length; i++) {
            hm.put(completion[i], hm.get(completion[i]) -1);
        }
        
        //System.out.println(hm.keySet());
        
        for(String str : hm.keySet()) {
            //System.out.println(hm.get(str));
            if(hm.get(str) > 0)    answer = str;
        }
        
        return answer;
    }
}