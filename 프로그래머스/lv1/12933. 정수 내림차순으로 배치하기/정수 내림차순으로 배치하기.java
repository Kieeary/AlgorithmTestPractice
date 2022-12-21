import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        int size = 1;
        long cn = n;
        
        while(cn / 10 != 0) {
            cn = cn / 10;
            size++;
        }
        
        long[] arr = new long[size];
        
        //하나하나 분리
        for(int i = 0; i<arr.length; i++) {
            arr[i] = n % 10;
            n = n / 10;
        }
        
        for(int i =0; i<arr.length; i++) {
            for(int j = i+1; j<arr.length; j++) {
                if(arr[i] < arr[j]){
                    long tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        
        //분리한거 다시 합치기
        for(int i = 0; i < arr.length; i++) {
            answer = answer + arr[i];
            if(i < arr.length -1)   answer = answer * 10;
        }
        return answer;
    }
}