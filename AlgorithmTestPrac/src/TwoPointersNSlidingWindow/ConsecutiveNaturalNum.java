package TwoPointersNSlidingWindow;

import java.util.Scanner;

public class ConsecutiveNaturalNum {

	public int Solution(int n) {
		int answer = 0;
		int sum = 0;
		int m = n/2 + 1;
		
		int li = 0;
		
		int[] arr = new int[m];
		for(int i =0; i < m; i++) {
			arr[i] = i+1;
		}
		
		for(int i = 0; i< m; i++) {
			sum = sum + arr[i];
			
			if(sum == n) {
				answer++;
			}
			while(sum > n) {
				sum = sum - arr[li];
				li++;
				if(sum == n)	{
					answer++;
					break;
				}
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
