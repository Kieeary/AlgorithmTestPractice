class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int smaller = 0;
        
        if(n > m) smaller = m;
        else smaller = n;
        
        // 최대공약수
        for(int i = 1; i <= smaller; i++) {
            if((n % i == 0) && (m % i == 0))    answer[0] = i;
        }
        
        // 최소공배수
        int num1 = n;
        int k1 = 2;
        int num2 = m;
        int k2 = 2;
        
        while(num1 != num2) {
            if(num1 < num2) {
                num1 = n * k1;
                k1++;
            } else {
                num2 = m * k2;
                k2++;
            }
        }
        
        answer[1] = num1;
        return answer;
    }
}