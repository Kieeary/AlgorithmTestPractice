import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int answer = -1;
        
        // 5kg으로 모두 가능한 경우
        if(n % 5 == 0) {
            answer = n/5;
            
        } else { // 5와 3으로 나눠지거나 3으로만 나눠지는 경우
        	int cnt = n/5;
        	for(int i = 0; i<=cnt; i++) {
        		if((n - ((cnt-i) * 5)) % 3 == 0) {
        			answer = (cnt - i) + (n - ((cnt-i) * 5)) / 3;
        			break;
        		}
        	}
        	
        }
        System.out.print(answer);
    }
}