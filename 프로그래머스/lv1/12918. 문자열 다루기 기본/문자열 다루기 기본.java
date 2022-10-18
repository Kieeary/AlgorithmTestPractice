class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        if(s.length() == 4 || s.length() == 6)  {
            for(char c : s.toCharArray()) {
                if(c >= '0' && c <= '9')    continue;
                else answer = false;
            }
        } else answer = false;
        return answer;
    }
}