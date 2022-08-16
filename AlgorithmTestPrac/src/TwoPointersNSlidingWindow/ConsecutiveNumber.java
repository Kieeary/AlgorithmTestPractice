package TwoPointersNSlidingWindow;

import java.util.Scanner;

public class ConsecutiveNumber {
	
	public int Solution(int num1, int num2, int[] arr) {
		
		int index = 0;
		int answer = 0;
		int tmp = 0;
		int ri = 0;
		
		while(tmp < num2) {
			tmp = tmp + arr[index];
			
			if(tmp < num2) {
				index++;
			}
			
			if(tmp == num2) {
				break;
			}
		}
		
		while(index < num1) {
			
			if(tmp > num2) {
				tmp = tmp - arr[ri++];
			}
			
			else if(tmp < num2) {
				index++;
				if(index < num1) {
				tmp = tmp + arr[index];
				}
			}
			
			else if(tmp == num2) {
				answer++;
				index++;
				if(index < num1) {
				tmp = tmp + arr[index] - arr[ri];
				}
				ri++;
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
