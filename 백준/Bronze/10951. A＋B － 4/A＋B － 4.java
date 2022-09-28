import java.util.*;

public class Main{
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String args[]) {
        
        while(sc.hasNext()) {
            String str = sc.nextLine();
            String[] s = str.split(" ");
            int[] a = {Integer.parseInt(s[0]), Integer.parseInt(s[1])};
            
            System.out.println(a[0]+a[1]);
        }
    }
}