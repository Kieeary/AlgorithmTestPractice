package StringTestPrac;

import java.util.Scanner;

public class Palindrome2 {

	static Scanner sc = new Scanner(System.in);

	public String Solution(String str) {

		str = str.toLowerCase();
		String answer = "YES";
		int index = str.length() - 1;

		int k = 0;

		for (int i = 0; i < str.length(); i++) {
			if (Character.isAlphabetic(str.charAt(i))) {
				while (k < str.length()) {
					if (!Character.isAlphabetic(str.charAt(index - k))) {
						k++;
						continue;
					} else if (str.charAt(i) == str.charAt(index - k)) {
						k++;
						break;
					} else if (str.charAt(i) != str.charAt(index - k)) {
						k++;
						answer = "NO";
						return answer;
					}

				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {

		Palindrome2 main = new Palindrome2();

		System.out.println("문자열 입력: ");
		String str = sc.nextLine();
		System.out.println(main.Solution(str));

	}
}