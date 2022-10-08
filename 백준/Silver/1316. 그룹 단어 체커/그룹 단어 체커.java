import java.util.*;

public class Main{
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        boolean flag = false;
        int n = sc.nextInt();
        int answer = 0;
        
        for(int i = 0; i<n; i++) {
            
            int idx = 0;
            int cpIdx = idx+1;
            String str = sc.next();
            if(str.length() == 1)	{
            	//System.out.print("길이가 1");
            	answer++;
            	continue;
            }
            String tmpStr = "";
            char c[] = str.toCharArray();
            
            while(idx != str.length()-1) {
            	//System.out.println("1");
            	tmpStr = "";
            	flag = false;
                while(c[idx] == c[cpIdx]){
                    if(cpIdx == str.length()-1) { // 마지막확인했을
                    	//System.out.print("여기들어옴");
                        answer++;
                        idx = cpIdx;
                        flag = true;
                        break;
                    }
                    cpIdx++;
                } // 연속적인 알파벳 위치 파악
                
                if(!flag) {
                // 여기서부터는 c[idx] 와 c[cpIdx] 의 알파벳은 다름
                String tmp = String.valueOf(c[idx]);
                tmpStr = str.substring(cpIdx);
                
                // 이전에 있던 알파벳이 뒤에 또 있는 경우
                if(tmpStr.contains(tmp)){
                	//System.out.println("포함");
                     break;   
                }
                
                idx = cpIdx;
                if(idx == str.length() -1)    {
                	//System.out.println(i + "번");
                	answer++;
                }
                else    cpIdx++;
                
                }
               
            }
        }
        System.out.println(answer);
    }
}