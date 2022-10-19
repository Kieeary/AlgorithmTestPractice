class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        float[] line = new float[6];
        int index =0 ;
        for(int i=0;i<3;i++) {
            for(int j=i+1; j<4;j++) {
                float xDegree =(float)(dots[i][0]- dots[j][0]);
                float yDegree = (float)(dots[i][1]-dots[j][1]);
//                System.out.println(xDegree + " " + yDegree);
                
                float result = yDegree / xDegree;
                System.out.println("Result: " + result);
                //0같은게 문제인 것 같은데..
                if(Double.isNaN(result)){ answer++;};
                line[index] = result;
//                System.out.println(line[index]);
                index++;
            }
        }
        
        // for(int k = 0; k < line.length; k++){
        //     for(int m=k+1; m<line.length;m++) {
        //         if (line[k] == line[m]) answer++;
        //     }
        // }
        
        for(int i = 0; i< line.length/2 +1; i++) {
            if(line[i] == line[line.length - 1 -i]) answer = 1;
        }
//        System.out.println("as:"+answer);
        
        return answer;
    }
}