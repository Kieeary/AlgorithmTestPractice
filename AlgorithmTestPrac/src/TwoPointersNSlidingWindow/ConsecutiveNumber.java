package TwoPointersNSlidingWindow;

import java.util.Scanner;

public class ConsecutiveNumber {
	
	public int Solution(int num1, int num2, int[] arr) {
		
		int answer=0;
		int lt = 0;
		int result = 0;
		
		for(int rt =0; rt<num1; rt++) {
			result = result + arr[rt];
			
			if(result == num2) {
				answer++;
			}
			while(result > num2) {
				result = result - arr[lt];
				lt++;
				if(result == num2)	{
					answer++;
					break;
				}
			}
		}
		
		return answer;
		
	}

	public static void main(String[] args) {

		ConsecutiveNumber main = new ConsecutiveNumber();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int[] arr = new int[num1];
		
		for(int i =0; i<num1; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print(main.Solution(num1, num2, arr));
		
	}

}
