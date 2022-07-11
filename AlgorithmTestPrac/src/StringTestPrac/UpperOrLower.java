package StringTestPrac;

import java.util.Scanner;

public class UpperOrLower {
	
public String Solution(String res) {
		
		String ans = ""; 

		for(char c : res.toCharArray()) {
			if(c >= 65 && c <=90) {
				ans = ans + (char)(c+32);
			} else {
				ans = ans + (char)(c-32);
			}
//			if(Character.isLowerCase(c)) {
//				ans = ans + Character.toUpperCase(c);
//			} else {
//				ans = ans + Character.toLowerCase(c);
//			}
		}
		return ans;
	}
	public static void main(String[] args) {
		
		UpperOrLower main = new UpperOrLower();

		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 입력: ");
		String str = sc.next();
		
	System.out.print(main.Solution(str));
		
	}
}
	
