package StringTestPrac;

import java.util.Scanner;

public class Number {
	
	public int Solution(String str) {
		
	String newNum = "";
		
	for(char c : str.toCharArray()) {
		if(Character.isDigit(c)) {
			newNum = newNum + c;
		}
	}
	int result = Integer.parseInt(newNum);
	
	return result;
	}

	public static void main(String[] args) {

		Number main = new Number();
		
		System.out.print("문자열 입력: ");
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		System.out.println(main.Solution(str));
	}

}
