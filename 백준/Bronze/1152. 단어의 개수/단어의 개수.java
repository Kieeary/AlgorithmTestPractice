import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        answer = arr.length;
        
        
        if(arr.length != 0 && arr[0].equals(""))	answer--;
        
        System.out.println(answer);
    }
}