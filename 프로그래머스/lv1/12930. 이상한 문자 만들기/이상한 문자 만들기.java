class Solution {
    public String solution(String s) {
         String a = " tRy hello   WORLD  ";

        String[] ex = a.split(" ");
        
        for(int i = 0; i<ex.length; i++) {
            System.out.println(ex[i]);
        }
        
        String answer = "";
        String[] strArr = s.split(" ");
//        String[] tmpArr = new String[strArr.length];                                                                                                                                      
        for(int i = 0; i<strArr.length; i++) {
            String tmp = "";
            int idx = 0;
            
            if(strArr[i].equals("")){
                answer += " ";    
                continue;
            }
            
            for(char c : strArr[i].toCharArray()) {
                if(idx % 2 == 0) {
                    tmp += Character.toUpperCase(c);
                } else {
                    tmp += Character.toLowerCase(c);
                }
                idx++;
            }
            answer += tmp;
            answer += " ";
        }
        if(answer.length() > s.length())    answer = answer.substring(0, s.length());
        else {
            while(answer.length() != s.length()) {
                answer += " ";
            }
        }
        
        return answer;
    }
}