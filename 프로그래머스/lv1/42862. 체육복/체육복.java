import java.util.*;

class Info implements Comparable<Info> {
    int num;
    char str;
    
    public Info(int num, char str){
        this.num = num;
        this.str = str;
    }
    
    @Override
    public int compareTo (Info o) {
        return this.num - o.num;
    }
}

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        ArrayList<Info> al = new ArrayList<>();
        
        for(int a : lost) {
            al.add(new Info(a, 'l'));
        }
        
        for(int a : reserve) {
            al.add(new Info(a, 'r'));
        }
        
        Collections.sort(al);
        
        for(Info i : al) {
            System.out.println(i.num + " " + i.str);
        }
        return answer;
    }
}