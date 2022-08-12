package Array;

import java.util.Scanner;

public class Peaks {

	int[] dx = { -1, 0, 1, 0 };
	int[] dy = { 0, -1, 0, 1 };

	public int Solution(int num, int[][] arr) {

		int answer = 0;

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				boolean flag = true;
				for (int k = 0; k < 4; k++) {
					
					int nx = i + dx[k];
					int ny = j + dy[k];
					
					if ( nx >= 0 && nx < num&& ny >= 0 && ny < num && arr[i][j] <= arr[nx][ny]) {
						flag = false;
					}

				}

				if (flag) {
					answer++;
				}
			}
		}

		return answer;
	}

	public static void main(String[] args) {

		Peaks main = new Peaks();

		Scanner sc = new Scanner(System.in);

		System.out.print("입력: ");
		int num = sc.nextInt();

		int[][] arr = new int[num][num];

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.print(main.Solution(num, arr));
	}

}
