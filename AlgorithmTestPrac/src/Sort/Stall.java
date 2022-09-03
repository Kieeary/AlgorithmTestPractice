package Sort;

import java.util.Arrays;
import java.util.Scanner;

public class Stall {

	public int count(int[] arr, int mid) {

		int cnt = 1;
		int ep = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] - ep >= mid) {
				ep = arr[i];
				cnt++;
			}
		}
		return cnt;
	}

	public int Solution(int n, int s, int[] arr) {

		Arrays.sort(arr);

		int answer = 0;
		int lt = 1;
		int rt = arr[n - 1];

		int mid = 0;

		while (lt <= rt) {

			mid = (lt + rt) / 2;
			if (count(arr, mid) >= s) {
				lt = mid + 1;
				answer = mid;
			} else
				rt = mid - 1;
		}
		return answer;
	}

	public static void main(String[] args) {

		Stall main = new Stall();
		Scanner sc = new Scanner(System.in);

		System.out.print("입력 : ");
		int n = sc.nextInt();
		int s = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print(main.Solution(n, s, arr));
	}

}
