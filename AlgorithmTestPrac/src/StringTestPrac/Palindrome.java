package StringTestPrac;

import java.util.Scanner;

public class Palindrome {
	
	static Scanner sc = new Scanner(System.in);

	public String Solution(String str) {
		
		String lowerStr = str.toLowerCase();
		System.out.print(lowerStr);
		
		int length = str.length()-1;
		int flag = 0;
		
		for(int i = 0; i < str.length()/2; i++) {
			if(lowerStr.charAt(i) != lowerStr.charAt(length-i)) {
				return "NO";
			} else {
				flag = 1;
			}
		}
		
		return "YES";
	}
	
	public static void main(String[] args) {
		
		Palindrome main = new Palindrome();
		
		System.out.print("문자열 입력: ");
		String str = sc.next();
		
		System.out.println(main.Solution(str));
	}

}
