package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class LookingStudent {

	public int Solution(int num, int[] arr) {

		ArrayList<Integer> ans = new ArrayList<>();
		int max = arr[0];

		ans.add(arr[0]);

		for (int i = 1; i < num; i++) {
			if (arr[i - 1] < arr[i] && arr[i] > max) {
				ans.add(arr[i]);
				max = arr[i];
			}
		}

		int answer = ans.size();
		return answer;
	}

	public static void main(String[] args) {

		LookingStudent main = new LookingStudent();

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int[] arr = new int[num];

		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(main.Solution(num, arr));

	}

}
