import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int cnt = sc.nextInt();
        int[] array = new int[cnt];
        
        for(int i = 0; i<cnt; i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        
        for(int i = 0; i<cnt; i++)    System.out.println(array[i]);
    }
}