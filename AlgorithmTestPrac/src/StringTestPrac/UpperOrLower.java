package StringTestPrac;

import java.util.Scanner;

public class UpperOrLower {
	
public void Solution(String res) {
		
		String str = res;
		int size = str.length();
		
		char ans[] = str.toCharArray();
		
		for(int i = 0; i<size; i++) {
			if(ans[i] >= 'a') {
				ans[i] = Character.toUpperCase(ans[i]);
			} else {
				ans[i] = Character.toLowerCase(ans[i]);
			}
		}
		System.out.print(ans);
	}

	public static void main(String[] args) {
		
		UpperOrLower main = new UpperOrLower();

		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 입력: ");
		String str = sc.next();
		
		main.Solution(str);
		
	}
}
	
