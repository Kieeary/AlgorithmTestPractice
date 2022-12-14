import java.util.*;

class Solution {
    HashSet<Integer> hs = new HashSet<>();
    
    public int solution(String numbers) {
        int answer = 0;
        
        char[] sp_num = numbers.toCharArray();
        int c_size = sp_num.length;
        int[] i_num = new int[c_size];
        
        for(int i = 0; i<c_size; i++) {
            i_num[i] = sp_num[i] - '0';
        }
        
        Arrays.sort(i_num);
        int max_num = 0;
        
        for(int i =c_size-1; i>=0; i--) {
            max_num = (max_num + i_num[i]) * 10;
        }
        
        max_num = max_num / 10; // numbers 문자열에서 만들 수 있는 가장 큰 값
        
        int[] oddNum = new int[max_num + 1];      
        
        for(int i = 0; i<oddNum.length; i++) {
            oddNum[i] = i;
        }
        
        // 아리스토테네스의 체
        for(int i = 2; i< oddNum.length; i++) {
            if(oddNum[i] != 0) {
                int tmp = 2;
                while(i * tmp <= max_num) {
                    oddNum[i*tmp] = 0;
                    tmp++;
                }
            }
            
            else if(oddNum[i] == 0) continue;
        }
    
        ArrayList<Integer> onlyOdd = new ArrayList<>();
       
        for(int i = 2; i<oddNum.length; i++) {
            if(oddNum[i] != 0)  onlyOdd.add(oddNum[i]); 
        }
        
        rec("", numbers);  // 모든 수의 조합 계산
        
        for(int i = 0; i<onlyOdd.size(); i++) {
            if(hs.contains(onlyOdd.get(i)))  answer++;
        }
        
        Iterator<Integer> iter = hs.iterator();
        
        return answer;
    }
    
    public void rec(String target, String rest) {
        if(!target.equals("")) {
            hs.add(Integer.parseInt(target));
        }
            
        for(int i = 0; i<rest.length(); i++) {
            rec(target + String.valueOf(rest.charAt(i)), 
                rest.substring(0, i) + rest.substring(i+1));
        }
    }
}