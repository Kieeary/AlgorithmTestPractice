import java.util.*;

class Solution {
    public String solution(String new_id) {
        String answer = "";
        String tmpAnswer = "";
        
        // 1단계 완료
        answer = new_id.toLowerCase();
        
        // 2단계 완료
        for(int i =0; i<answer.length(); i++) {
            if((answer.charAt(i) >= 'a' && answer.charAt(i) <= 'z') 
              || (answer.charAt(i) >= '0' && answer.charAt(i) <='9')
              || (answer.charAt(i) == '-' || answer.charAt(i) == '_' || 
                  answer.charAt(i) =='.')) {
                tmpAnswer = tmpAnswer + answer.charAt(i);
            }
        }
        
        answer = "";
        
        System.out.println(tmpAnswer);
        int len = tmpAnswer.length();
        //3단계 완료
        for(int i = 0; i<len; i++) {
            tmpAnswer = tmpAnswer.replace("..",".");
        }   
        System.out.println(tmpAnswer);
        //4단계 완료
        if(tmpAnswer.charAt(0) == '.') {
            tmpAnswer = tmpAnswer.substring(1);
        }
        
        if(tmpAnswer.length() > 0 && tmpAnswer.charAt(tmpAnswer.length() - 1) == '.') {
            tmpAnswer = tmpAnswer.substring(0, tmpAnswer.length() - 1);
        }
        
        // 5단계 완료
        if(tmpAnswer.equals("")) {
            tmpAnswer = "a";
        }
        
        // 6단계 완료
        if(tmpAnswer.length() >= 15) {
            tmpAnswer = tmpAnswer.substring(0,15);
            
            if(tmpAnswer.charAt(14) == '.') {
                tmpAnswer = tmpAnswer.substring(0,14);
            }
        }
        
        // 7단계
        if(tmpAnswer.length() <= 2) {
            char last = tmpAnswer.charAt(tmpAnswer.length() -1);
            while(tmpAnswer.length() < 3) {
                tmpAnswer += last;
            }
        }

        
        
        //System.out.println(answer);
        return tmpAnswer;
    }
}