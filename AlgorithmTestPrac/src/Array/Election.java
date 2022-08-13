package Array;

import java.util.Scanner;

public class Election {

	public int Solution(int num, int[][] arr) {

		int result[][] = new int[num][num];

		int max = Integer.MIN_VALUE;
		int answer = 0;

		for (int i = 1; i < num + 1; i++) {
			int cnt = 0;
			for (int j = 1; j < num + 1; j++) {
				for (int k = 1; k < 6; k++) {
					if (arr[i][k] == arr[j][k]) {
						cnt++;
						break;
					}
				}
			}
			if(max < cnt)	{
				max = cnt;
				answer = i;
			}
	
		}
		return answer;
	}

	public static void main(String[] args) {

		Election main = new Election();

		Scanner sc = new Scanner(System.in);

		System.out.print("입력: ");
		int num = sc.nextInt();
		int[][] arr = new int[num + 1][6];

		for (int i = 1; i < num + 1; i++) {
			for (int j = 1; j < 6; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.print(main.Solution(num, arr));
	}

}
