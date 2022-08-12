package Array;

import java.util.Scanner;

public class Peaks {

	public int Solution(int num, int[][] arr) {

		int answer = 0;

		for (int i = 1; i < num - 1; i++) {
			for(int j = 1; j<num-1; j++) {
				if((arr[i][j] > arr[i-1][j]) && (arr[i][j] > arr[i][j-1]) && (arr[i][j] > arr[i+1][j]) && (arr[i][j] > arr[i][j+1]))	answer++;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {

		Peaks main = new Peaks();

		Scanner sc = new Scanner(System.in);

		System.out.print("입력: ");
		int num = sc.nextInt();
		num += 2;

		int[][] arr = new int[num][num];
		
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if ((i < 1 || i > 5) && (j < 1 || j > 5)) {
					arr[i][j] = 0;
				}
			}
		}

		for (int i = 1; i < num -1; i++) {
			for (int j = 1; j < num-1; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.print(main.Solution(num, arr));
	}

}
