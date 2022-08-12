package Array;

import java.util.Scanner;

public class Grating {

	public int Solution(int num, int[][] arr) {

		int max = Integer.MIN_VALUE;
		int tmp = 0;

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				tmp = tmp + arr[i][j];
			}
			if (tmp > max)
				max = tmp;
			tmp = 0;
		}

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				tmp = tmp + arr[j][i];
			}
			if (tmp > max)
				max = tmp;
			tmp = 0;
		}

		int j = 0;
		int i = 0;

		while (i < num) {
			tmp = tmp + arr[i][j];
			i++;
			j++;
		}
		if (tmp > max) {
			max = tmp;
		}
		tmp = 0;

		i = num - 1;
		j = 0;
		while (j < num) {
			tmp = tmp + arr[i][j];
			i--;
			j++;
		}
		if (tmp > max) {
			max = tmp;
		}

		return max;
	}

	public static void main(String[] args) {

		Grating main = new Grating();

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
