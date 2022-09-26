import java.util.*;

public class Main{
            
    static Scanner sc = new Scanner(System.in);
    
    public String Solution(int price, int n) {
        String answer = "No";

        int sum = 0;
        
        for(int i = 0; i<n; i++) {
            
            int tmpPrice = sc.nextInt();
            int tmpNum = sc.nextInt();
            
            sum += (tmpPrice * tmpNum);
        }
        if(sum == price)    answer = "Yes";
        
        return answer;
    }
    
    public static void main(String[] args) {
        
        Main main = new Main();
        
        int price = sc.nextInt();
        int n = sc.nextInt();
        
        System.out.print(main.Solution(price, n));
    }
}