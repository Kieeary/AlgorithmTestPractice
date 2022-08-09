package Array;

import java.util.Scanner;

public class RSP {

	static Scanner sc = new Scanner(System.in);

	public String Solution(int num, int[] A, int[] B) {
		String answer = "";

		for (int i = 0; i < num; i++) {
			if (A[i] == B[i])
				answer += "D";

			else if (A[i] == 1 && B[i] == 3)
				answer += "A";

			else if (A[i] == 2 && B[i] == 1)
				answer += "A";

			else if (A[i] == 3 && B[i] == 2)
				answer += "A";

			else
				answer += "B";
		}
		return answer;
	}

	public static void main(String[] args) {

		RSP main = new RSP();
		Scanner sc = new Scanner(System.in);

		System.out.print("입력: ");
		int num = sc.nextInt();

		int[] A = new int[num];
		int[] B = new int[num];

		for (int i = 0; i < num; i++) {
			A[i] = sc.nextInt();
		}

		for (int i = 0; i < num; i++) {
			B[i] = sc.nextInt();
		}

		for (char c : main.Solution(num, A, B).toCharArray()) {
			System.out.println(c);
		}
	}

}
