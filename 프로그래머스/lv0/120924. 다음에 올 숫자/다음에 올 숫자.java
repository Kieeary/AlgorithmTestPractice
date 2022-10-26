class Solution {
    public int solution(int[] common) {
        
        int answer = 0;
        int l = common.length;
        int a1 = common[1] - common[0];
        int a2 = common[2] - common[1];
        
        if(a1 == a2) { //등차수열인 경우
            answer = common[l - 1] + a1;
        } else {
            if(common[0] == 0)  {
                answer = 0;
                return 0;
            } else{
            int b1 = common[1]/common[0];
                answer = common[l-1] * b1;
            }
        }
        
        // if((common[1] - common[0]) == (common[2] - common[1])) { //등차수열인 경우
        //     answer = common[l - 1] + a1;
        // } else if((common[1]/common[0]) == (common[2]/common[1])) { // 등비수열인 경우
        //     answer = common[l - 1] * b1;
        // }
        
        return answer;
    }
}