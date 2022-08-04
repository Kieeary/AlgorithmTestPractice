package StringTestPrac;

import java.util.Scanner;

public class Shortestlength {

	public void Solution(String str) {

		String[] arr = str.split(" ");
		String st = arr[0];

		char ch = arr[1].charAt(0);

		int min = Integer.MAX_VALUE;

		for (int i = 0; i < st.length(); i++) {
			for (int j = 0; j < st.length(); j++) {
				if (st.charAt(j) == ch) {
					int check = j - i;
					if (check < 0)
						check = 0 - check;

					if (check < min)
						min = check;
				} else
					continue;
			}
			System.out.print(min + " ");

			min = Integer.MAX_VALUE;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("문자열과 문자를 입력하세요: ");
		String str = sc.nextLine();

	}
}
