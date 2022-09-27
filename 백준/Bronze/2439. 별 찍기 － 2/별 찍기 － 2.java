import java.util.*;

public class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for(int i = 1; i<=n; i++) {
            for(int j = 1; j<=n; j++) {
                int tmp = n-i;
                if(j <= tmp) System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println();
        }
    }
}