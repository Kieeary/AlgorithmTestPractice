package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class LookingStudent {

	public int Solution(int num, int[] arr) {
		
		int answer = 1;
		int max = arr[0];

		for (int i = 1; i < num; i++) {
			if (arr[i] > max) {
				max = arr[i];
				answer++;
			}
		}
		return answer;
	}

	public static void main(String[] args) {

		LookingStudent main = new LookingStudent();

		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 입력:");
		int num = sc.nextInt();
		int[] arr = new int[num];

		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(main.Solution(num, arr));

	}

}
