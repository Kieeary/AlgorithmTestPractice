package StringTestPrac;

import java.util.Scanner;

public class Palindrome2 {

	static Scanner sc = new Scanner(System.in);

	public String Solution(String str) {

		String answer = "YES";
		
		str = str.toLowerCase();
		str = str.replaceAll("[^a-z]", "");
		
		
		String newStr = new StringBuilder(str).reverse().toString();
		
		if(str.equals(newStr)) {
			return answer;
		}
		else {
			answer = "NO";
			return answer;
		}
	}

	public static void main(String[] args) {

		Palindrome2 main = new Palindrome2();

		System.out.println("문자열 입력: ");
		String str = sc.nextLine();
		System.out.println(main.Solution(str));

	}
}