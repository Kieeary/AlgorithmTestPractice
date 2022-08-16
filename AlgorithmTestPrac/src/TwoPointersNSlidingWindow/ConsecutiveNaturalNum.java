package TwoPointersNSlidingWindow;

import java.util.Scanner;

public class ConsecutiveNaturalNum {

	public int Solution(int n) {
		int answer = 0;
		int m = n/2 + 1;
		
		for(int i = 2; i<m; i++) {
			if(i%2 == 0) {
				if(n%i == i/2 && (n/i - ((n%i)-1) > 0))	answer++;
			}
			else {				
				if((n%i == 0) && (n/i - (i/2) > 0)) answer++;
			}
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
