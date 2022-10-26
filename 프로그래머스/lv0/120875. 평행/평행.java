import java.util.*;

class Solution {
    public double solution(int[][] dots) {
        int answer = 0;
        ArrayList<Double> list = new ArrayList<>();
        
        for(int i = 0; i<4; i++){
            for(int j = i+1; j<4; j++) {
                double tmp = ((double)dots[j][1] - (double)dots[i][1]) / 
                    ((double)dots[j][0] - (double)dots[i][0]);

                list.add(tmp);
            }
        }
        
        for(int idx = 0; idx < list.size(); idx++){
        for(int i = idx+1; i < list.size(); i++) {
            double a = list.get(idx);
            double b = list.get(i);
            
            // if(list.get(idx).equals(list.get(i)))    {
            //     answer = 1;
            // }
            if(a==b)    answer = 1;
        }
            
        }
        return answer;
    }
}