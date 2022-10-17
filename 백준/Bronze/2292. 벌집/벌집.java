import java.util.Scanner;

public class Main{
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int answer = 1;
        int tmp = 1;
        
        while(tmp < n) {
            tmp += (answer * 6);
            answer++;
        }
        
        System.out.print(answer);
    }
}