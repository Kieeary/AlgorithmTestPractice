package StringTestPrac;

import java.util.Scanner;

public class Number {

	public int Solution(String str) {

		int num = 0;

		for (char c : str.toCharArray()) {
			if (c >= 48 && c <= 57) {
				num = num * 10 + (c - 48);
			}
		}
		return num;
	}

	public static void main(String[] args) {

		Number main = new Number();
		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		System.out.println(main.Solution(str));
	}

}
