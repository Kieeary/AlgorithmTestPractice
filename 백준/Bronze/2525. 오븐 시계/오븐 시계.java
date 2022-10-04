import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        String[] split = str.split(" ");
        
        int si = Integer.parseInt(split[0]);
        int boon = Integer.parseInt(split[1]);
        
        int time = sc.nextInt();
        
        int tmp = boon + time;
        if(tmp >= 60) {
            int plusSi = tmp / 60;
            int plusBoon = tmp % 60;
            
            si += plusSi;
            boon = plusBoon;
            
            if(si > 23) {
                si = si - 24;
            }
            
        } else boon = tmp;
        
        System.out.println(si + " " + boon);
    }
}