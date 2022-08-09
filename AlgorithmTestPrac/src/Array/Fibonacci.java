package Array;

import java.util.Scanner;

public class Fibonacci {

	public int[] Solution(int num) {

		int arr[] = new int[num];

		arr[0] = 1;
		arr[1] = 1;

		for (int i = 2; i < num; i++) {
			arr[i] = arr[i - 2] + arr[i - 1];
		}

		return arr;

	}

	public static void main(String[] args) {

		Fibonacci main = new Fibonacci();

		Scanner sc = new Scanner(System.in);

		System.out.print("입력:");
		int num = sc.nextInt();

		for (int i : main.Solution(num)) {
			System.out.print(i + " ");
		}
	}
}
