package TwoPointersNSlidingWindow;

import java.util.Scanner;

public class MaxSales {
	
	public int Solution(int num, int num2, int[] arr) {
		
		int max = 0;		
		int tmpRes = 0;
		
		for(int i =0; i < num2; i++) {
			max = max + arr[i];
		}
		
		tmpRes = max;
		
		for(int i = num2; i< num; i++) {
			tmpRes = tmpRes + arr[i] - arr[i-num2];
			max = Math.max(max, tmpRes);
		}
		
		return max;
	}

	public static void main(String[] args) {
		
		MaxSales main = new MaxSales();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 :");
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		
		int[] arr = new int[num];
		for(int i =0; i<num; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print(main.Solution(num, num2, arr));
		
	}

}
