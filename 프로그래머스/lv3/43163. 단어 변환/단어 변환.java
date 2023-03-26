import java.util.*;

class Solution {
    
    static Queue<String> q = new LinkedList<>();
    static int[] ch;
    static int tmp_ans;
    
    public int BFS(String target, String[] words) {
        
        while(!q.isEmpty()) {
            int len = q.size();
            tmp_ans++;
            //System.out.println("tmp_ans: " + tmp_ans);
            
            for(int i = 0; i<len; i++) {
                String tmp_str = q.poll();
                
                if(tmp_str.equals(target))  return tmp_ans;
                
                // poll 한 단어와 그 외 다른 단어와 비교했을때 하나씩만 다른 단어들 추가
                for(int k = 0; k<words.length; k++) {
                    int dif = 0;
                    
                    for(int j =0; j<tmp_str.length(); j++) {
                        if(ch[k] == 1)  {
                            break;
                        }
                        
                        if(tmp_str.charAt(j) != words[k].charAt(j))   {
                            dif++;
                        } 
                    }
                    
                    if(dif == 1 & ch[k] == 0) {
                        q.add(words[k]);
                        ch[k] = 1;
                        //System.out.println(words[k]);
                    }
                }
            }    
        }
        return tmp_ans;
    }
    
    public int solution(String begin, String target, String[] words) {
        
        int answer = 0;
        ch = new int[words.length];
        boolean flag = false;
        
        for(int i =0; i<words.length; i++) {
            if(words[i].equals(target)) {
                flag = true;
                break;
            }
        }
        
        if(flag){
        // 처음에 변환할 수 있는 단어들을 체크
        for(int i =0; i<words.length; i++) {
            
            int tmp = 0;
            
            for(int j =0; j<begin.length(); j++) {
                if(begin.charAt(j) != words[i].charAt(j))   tmp++;
            } 
            
            if(tmp == 1)    {
                q.add(words[i]);
                ch[i] = 1;
            }
                
        answer = BFS(target, words);
        }
            return answer;
        }
        else {
            return 0;
        }
}
}