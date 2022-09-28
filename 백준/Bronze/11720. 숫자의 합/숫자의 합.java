import java.util.*;

public class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        int sum = 0;
        int idx = 0;
        int n = sc.nextInt();
        String str = sc.next();
        
        for(char c : str.toCharArray()) {
            int tmp = c - 48;
            sum += tmp;
        }
        
        System.out.print(sum);
        
    }
}