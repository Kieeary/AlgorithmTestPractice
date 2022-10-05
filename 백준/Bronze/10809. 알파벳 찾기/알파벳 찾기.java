import java.util.*;

public class Main{
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        int[] alph = new int[27];
        String str = sc.next();
        char c = 'a';
        
        for(int i = 1; i<alph.length; i++) {
            alph[i] = str.indexOf(c);
            c++;
            System.out.print(alph[i] + " ");
        }
    }
}