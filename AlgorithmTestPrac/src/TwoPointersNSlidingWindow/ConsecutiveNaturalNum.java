package TwoPointersNSlidingWindow;

import java.util.Scanner;

public class ConsecutiveNaturalNum {

	public int Solution(int n) {
		int answer = 0;
		int cnt = 1;
		n = n - cnt;
		
		while(n > 0) {
			cnt++;
			n = n -cnt;
			if(n % cnt == 0) answer++;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		ConsecutiveNaturalNum main = new ConsecutiveNaturalNum();

		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력: ");
		int n = sc.nextInt();
		System.out.print(main.Solution(n));
		
	}

}
