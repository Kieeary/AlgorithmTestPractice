package StringTestPrac;

import java.util.Scanner;

public class Palindrome {
	
	static Scanner sc = new Scanner(System.in);

	public String Solution(String str) {
		
		str = str.toLowerCase();
		
		int length = str.length()-1;
		String answer = "YES";
		
		for(int i = 0; i < str.length()/2; i++) {
			if(str.charAt(i) != str.charAt(length-i)) {
				answer = "NO";
				return answer;
			} 
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
