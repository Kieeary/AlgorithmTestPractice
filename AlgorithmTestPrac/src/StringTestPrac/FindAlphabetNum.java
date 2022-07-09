package StringTestPrac;

import java.util.Scanner;

public class FindAlphabetNum {
	
	public int Solution(String str, char c) {
		
		int ans = 0;
		str = str.toUpperCase();
		c = Character.toUpperCase(c);
	
		for(char x : str.toCharArray()) {
			if(x == c)	ans++;
		}
		
//		for(int i=0; i<str.length(); i++) {
//			if(c == str.charAt(i))	ans++;
//		}
//		
		return ans;
	}

	public static void main(String[] args) {
		FindAlphabetNum test = new FindAlphabetNum();
		
		Scanner scanner = new Scanner(System.in);
	
		String str = scanner.next();
		char c = scanner.next().charAt(0);
		
		System.out.print(test.Solution(str, c));
	}

}
