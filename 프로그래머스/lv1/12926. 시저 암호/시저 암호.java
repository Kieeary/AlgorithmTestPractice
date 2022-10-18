class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        int a = 'a';
        int A = 'Z';
        System.out.println("a :" + a);
        System.out.println("Z :" + A);
        
        //소문자로 입력받은것과 대문자로 입력받은걸 나눠야함
        for(char c : s.toCharArray()) {
            if(c == ' '){
                answer += ' ';   
                continue;
            }

            int tmp = c + n;
            char cTmp = (char)tmp;
            
            if(c >= 'a') {
                if(cTmp >= 'a' && cTmp <= 'z') {
                answer += Character.valueOf(cTmp);
            } else if(cTmp > 'z') {
                int r =  tmp - 'z';
                int tr = 'a' + r-1; 
                char ch = (char)tr;
                answer += Character.valueOf(ch);
                }
            } else {
                if(cTmp >= 'A' && cTmp <= 'Z') {
                answer += Character.valueOf(cTmp);
            } else if(cTmp > 'Z') {
                int r =  tmp - 'Z';
                int tr = 'A' + r-1; 
                char ch = (char)tr;
                answer += Character.valueOf(ch);
                }   
            }
        }
        return answer;
    }
}