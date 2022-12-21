import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        
        if(arr.length != 1) {
            int idx1 = -1;
            answer = new int[arr.length-1];
            int min = Integer.MAX_VALUE;
            for(int i = 0; i<arr.length; i++) {
                if(min > arr[i])    {
                    min = arr[i];
                    idx1 = i;
            }}
            
            int idx2= 0;
            for(int i=0; i<arr.length; i++) {
                if(i != idx1)    answer[idx2++] = arr[i];
            }} else {
                answer = new int[1];
                answer[0] = -1;
                }
        
        return answer;
    }
}