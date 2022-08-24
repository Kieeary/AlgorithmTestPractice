package StackNQueue;

import java.util.Scanner;
import java.util.Stack;

public class PuppetDraw {

	public int Solution(int[][] arr, int[] moves) {
		Stack<Integer> stack = new Stack<>();
		int answer = 0;

		for (int i : moves) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[j][i - 1] != 0) {
					int tmp = arr[j][i - 1];
					if (!stack.isEmpty() && tmp == stack.peek()) {
						stack.pop();
						answer = answer + 2;
						arr[j][i - 1] = 0;
						break;
					} else
						stack.push(tmp);
					arr[j][i - 1] = 0;
					break;
				}
			}
		}

		return answer;
	}

	public static void main(String[] args) {

		PuppetDraw main = new PuppetDraw();

		Scanner sc = new Scanner(System.in);

		System.out.print("입력: ");
		int N = sc.nextInt();
		int[][] arr = new int[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		int M = sc.nextInt();
		int[] moves = new int[M];

		for (int i = 0; i < M; i++) {
			moves[i] = sc.nextInt();
		}

		System.out.print(main.Solution(arr, moves));
	}

}
