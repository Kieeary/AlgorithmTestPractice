package TwoPointersNSlidingWindow;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxLength {

	public int Solution(int n, int m, int[] arr) {

		int max = -1;
		int lt = 0;
		int rt = 0;
		int length = 0;
		int cnt = 0;

		for (rt = 0; rt < n; rt++) {
			if (arr[rt] == 0)
				cnt++;
			while (cnt > m) {
				if (arr[lt] == 0)
					cnt--;
				lt++;
			}
			length = rt -lt + 1;
			max = Math.max(max, length);
		}

		return max;
	}

	public static void main(String[] args) {

		MaxLength main = new MaxLength();

		Scanner sc = new Scanner(System.in);

		System.out.print("입력 : ");
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print(main.Solution(n, m, arr));

	}

}
