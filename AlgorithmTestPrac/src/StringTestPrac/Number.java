package StringTestPrac;

import java.util.Scanner;

public class Number {
	
	public int Solution(String str) {
		
		String num = str.replaceAll("[^0-9]", "");
		int newNum = Integer.parseInt(num);
	
		return newNum;
	}

	public static void main(String[] args) {

		Number main = new Number();
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		System.out.println(main.Solution(str));
	}

}
