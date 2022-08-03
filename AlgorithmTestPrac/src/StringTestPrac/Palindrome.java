package StringTestPrac;

import java.util.Scanner;

public class Palindrome {
	
	static Scanner sc = new Scanner(System.in);

	public String Solution(String str) {
		
		str = str.toLowerCase();
		String answer = "NO";
		
		String reverseStr = new StringBuilder(str).reverse().toString();
		
		if(str.equals(reverseStr)) {
			answer = "YES";
		}
		return answer;
	}
	
	public static void main(String[] args) {
		
		Palindrome main = new Palindrome();
		
		System.out.print("문자열 입력: ");
		String str = sc.next();
		
		System.out.println(main.Solution(str));
	}

}
