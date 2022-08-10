package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class ReversePrimeNumber {

	static Scanner sc = new Scanner(System.in);

	public boolean isPrimeNumber(int reverse) {

		if (reverse == 1)
			return false;

		for (int j = 2; j < reverse; j++) {
			if (reverse % j == 0)
				return false;
		}
		
		return true;

	}

	public ArrayList<Integer> Solution(int num, int[] arr) {

		ArrayList<Integer> answer = new ArrayList<Integer>();

		int[] reverse = new int[num];

		for (int i = 0; i < num; i++) {

			int t = 0;
			int tmp = arr[i];
			int res = 0;

			while (tmp > 0) {
				t = tmp % 10; // 일의 자리 숫자만 남음
				res = res * 10 + t; // 일의 자리 숫자를 더함
				tmp = tmp / 10; // 일의 자리를 제외하고 새로운 tmp 정의
			}

			reverse[i] = res;
		}

		for (int i = 0; i < num; i++) {
			if (isPrimeNumber(reverse[i])) {
				answer.add(reverse[i]);
			}
		}

		return answer;

	}

	public static void main(String[] args) {

		ReversePrimeNumber main = new ReversePrimeNumber();

		System.out.print("입력 : ");
		int num = sc.nextInt();

		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i : main.Solution(num, arr)) {
			System.out.print(i + " ");
		}
	}
}
