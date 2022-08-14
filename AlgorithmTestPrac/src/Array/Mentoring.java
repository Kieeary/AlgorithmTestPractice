package Array;

import java.util.Scanner;

public class Mentoring {

	public int Solution(int studentNum, int testNum, int[][] arr) {

		int cnt = 0;
		int answer =0;

		for (int s = 1; s <= studentNum; s++) {
			for (int k = 1; k <= studentNum; k++) {
				cnt = 0;
				int mentor = -1;
				int mentee = -1;
				for (int i = 1; i <= testNum; i++) {
					for (int j = 1; j <= studentNum; j++) {
						if (arr[i][j] == s) {
							mentor = j;
						}
						if (arr[i][j] == k) {
							mentee = j;
						}
					}

					if (mentor < mentee) {
						cnt++;
					} 
				}
				
				if(cnt == testNum)	answer++;
			}
		}

		return answer;

	}

	public static void main(String[] args) {

		Mentoring main = new Mentoring();
		Scanner sc = new Scanner(System.in);

		System.out.print("입력: ");
		int studentNum = sc.nextInt();
		int testNum = sc.nextInt();

		int[][] arr = new int[testNum + 1][studentNum + 1];

		for (int i = 1; i <= testNum; i++) {
			for (int j = 1; j <= studentNum; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.print(main.Solution(studentNum, testNum, arr));

	}

}
