package TwoPointersNSlidingWindow;

import java.util.ArrayList;
import java.util.Scanner;

public class TwoArray {

	public ArrayList<Integer> Solution(int num1, int num2, int[] arr1, int[] arr2) {

		ArrayList<Integer> answer = new ArrayList<Integer>();
		int index = 0;
		int last = 0;
		int s = 0;
		boolean flag = false;

		for (int i = 0; i < num1; i++) {
			answer.add(arr1[i]);
			if (i == num1 - 1)
				last = arr1[i];
		}

		for (int i = 0; i < num2; i++) {
			if (answer.get(index) == last && answer.get(index) < arr2[i]) {
				s = i;
				flag = true;
				break;
			}

			if (answer.get(index) >= arr2[i]) {
				answer.add(index, arr2[i]);
			} else {
				i--;
			}
			index++;
		}

		if (flag) {
			for (int k = s; k < num2; k++) {
				answer.add(arr2[k]);
			}
		}
		return answer;
	}

	public static void main(String[] args) {

		TwoArray main = new TwoArray();
		Scanner sc = new Scanner(System.in);

		System.out.print("입력: ");
		int num1 = sc.nextInt();
		int[] arr1 = new int[num1];
		for (int i = 0; i < num1; i++) {
			arr1[i] = sc.nextInt();
		}

		int num2 = sc.nextInt();
		int[] arr2 = new int[num2];
		for (int i = 0; i < num2; i++) {
			arr2[i] = sc.nextInt();
		}

		for (int p : main.Solution(num1, num2, arr1, arr2)) {
			System.out.print(p + " ");
		}
	}

}
