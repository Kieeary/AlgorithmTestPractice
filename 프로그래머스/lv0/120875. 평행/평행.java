import java.util.*;

class Solution {
    public double solution(int[][] dots) {
        int answer = 0;
        ArrayList<Double> list = new ArrayList<>();
        
        
        for(int i = 0; i<4; i++){
            for(int j = i+1; j<4; j++) {
                double tmp = ((double)dots[j][1] - (double)dots[i][1]) / 
                    ((double)dots[j][0] - (double)dots[i][0]);
//                System.out.println(tmp + " ");
                list.add(tmp);
            }
        }
        
                while(!list.isEmpty()){
            double front = list.remove(0);
            double back  = list.remove(list.size()-1);
            if(front==back)
                return 1;
        }

        // for(int i=0; i< (list.size()/2); i++){
        //     if(list.get(i).equals(list.get(list.size()-(1+i)))) return 1;
        // }
        return answer;
    }
}