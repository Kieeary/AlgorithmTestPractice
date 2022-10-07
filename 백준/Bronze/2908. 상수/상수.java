import java.util.*;

public class Main{
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int tmpA = 0;
        int tmpB = 0;
        
        for(int i =0; i<3; i++) {
            if(i == 0){
                tmpA += (a%10) * 100;
                tmpB += (b%10) * 100;
            } else if(i == 1) {
                 tmpA += (a%10) * 10;
                 tmpB += (b%10) * 10;
            } else if(i == 2) {
                tmpA += (a%10);
                tmpB += (b%10);
            }
            a = a/10;
            b = b/10;
        }
        System.out.print(Math.max(tmpA, tmpB));
    }
}