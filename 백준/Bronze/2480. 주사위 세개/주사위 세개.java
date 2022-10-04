import java.util.*;

public class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        String[] split = str.split(" ");
        
        int a = Integer.parseInt(split[0]);
        int b = Integer.parseInt(split[1]);
        int c = Integer.parseInt(split[2]);
        
        int sum = 0;
        
        int cnt = 0;
        if(a == b) {
            if(a == c){ // 3개가 다 동일
                sum = 10000 + (a * 1000);
            }else { //2개가 동일
                sum = 1000 + (a * 100);
            }
        } else if(a == c) {
            sum = 1000 + (a * 100);
        } 
        else if(b == c) { //2개가 동일
             sum = 1000 + (b * 100);
        } else { // 동일한것 없는 경우
             sum = 100 * (Math.max(a, Math.max(b, c)));
        }
        System.out.print(sum);
    }
}