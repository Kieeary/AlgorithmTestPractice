package Sort;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public int Solution(int[] arr, int m) {

		int lt = 0;
		int rt = arr.length-1;
		int tmpIdx = (rt - lt + 1)/2 ;
		int answer = 0;

		while (true) {
			if (arr[tmpIdx] > m) {
				rt = tmpIdx - 1;
			} else if (arr[tmpIdx] < m) {
				lt = tmpIdx + 1;
			} else {
				answer = tmpIdx + 1;
				break;
			}
			tmpIdx = lt + (rt - lt + 1)/2;
		}

		return answer;
	}

	public static void main(String[] args) {

		BinarySearch main = new BinarySearch();
		Scanner sc = new Scanner(System.in);

		System.out.print("입력 :");
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);

		System.out.print(main.Solution(arr, m));
	}

}
