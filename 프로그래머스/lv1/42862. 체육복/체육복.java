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
        int answer = n;
        int count = 0;
        ArrayList<Info> al = new ArrayList<>();
        
        for(int a : lost) {
            al.add(new Info(a, 'l'));
            count--;
        }
        
        for(int a : reserve) {
            al.add(new Info(a, 'r'));
        }
        
        Collections.sort(al);
        
        for(int i = 0; i<al.size(); i++) {
            if(al.get(i).str == 'l') {
                if(i < al.size()-1 && (al.get(i+1).num == al.get(i).num) && 
                          al.get(i+1).str == 'r') {
                    al.get(i+1).str = 'u';
                    count++;
                }
                else if(i > 0 && (al.get(i-1).num + 1 == al.get(i).num) && al.get(i-1).str ==                             'r') {
                    al.get(i-1).str = 'u';
                    count++;
                } else if(i < al.size()-1 && (al.get(i+1).num - 1 == al.get(i).num) && 
                          al.get(i+1).str == 'r'){
                    al.get(i+1).str = 'u';
                    count++;
                } else continue;
            }
        }
 
        answer = answer + count;
        
        return answer;
    }
}