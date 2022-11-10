import java.util.*;

class Main{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
       
        long n = C - B;
        long answer = 0;
        
        if(n <= 0)    answer = -1;
        else {
            long tmp = A/n;
            answer = tmp+1;
        }
        
        System.out.println(answer);
    }
}