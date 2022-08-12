package Array;

import java.util.Scanner;

public class Grating {

	public int Solution(int num, int[][] arr) {

		int max = Integer.MIN_VALUE;
		int sum1, sum2;
		
		for(int i =0; i<num; i++) {
			sum1 = sum2 = 0;
			for(int j=0; j<num; j++) {
				sum1 = sum1 + arr[i][j];
				sum2 = sum2 + arr[j][i];
			}
			max = Math.max(max, sum1);
			max = Math.max(max, sum2);
		}

		sum1 = sum2 = 0;
		for(int i = 0; i<num; i++) {
			sum1 = sum1 + arr[i][i];
			sum2 = sum2 + arr[i][num-i-1];
		}
		max = Math.max(max, sum1);
		max = Math.max(max, sum2);
		
		return max;
	}

	public static void main(String[] args) {

		Grating main = new Grating();

		Scanner sc = new Scanner(System.in);

		System.out.print("입력: ");
		int num = sc.nextInt();
		int[][] arr = new int[num][num];

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.print(main.Solution(num, arr));

	}

}
