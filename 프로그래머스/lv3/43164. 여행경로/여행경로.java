import java.util.*;

class Solution {
    
    static ArrayList<String> al = new ArrayList<>();
    
    static public void dfs(String start, int cnt, int[] ch, String result, String[][] tickets) {
        
        if(cnt == tickets.length)   {
            al.add(result);
        }
        
        else {
            for(int i =0; i<tickets.length; i++) {
                if(start.equals(tickets[i][0]) && ch[i] == 0) {
                    ch[i] = 1;
                    cnt++;
                    dfs(tickets[i][1], cnt, ch, result + " " + tickets[i][1], tickets);
                    cnt--;
                    ch[i] = 0;
                } 
            }
        }
    }
    
    public String[] solution(String[][] tickets) {
        
        // 방문 여부 확인
        int[] ch = new int[tickets.length];
        String result = "ICN";
        int cnt = 0;
        
        dfs("ICN", cnt, ch, result, tickets);
        
        Collections.sort(al);
        String[] answer = al.get(0).split(" ");
        //System.out.println(al.get(0));
        
        
        return answer;
    }
}