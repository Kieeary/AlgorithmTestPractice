package StringTestPrac;

import java.util.Scanner;

public class DuplicateCharacterDelete {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		String newStr = "";

		char[] strTochar = str.toCharArray();
		
		for(int i = 0; i < strTochar.length - 1; i++) {
			for(int j = i + 1; j < strTochar.length; j++) {
				if(strTochar[i] == strTochar[j]) {
					
				}
				
			}
		}

	}

}
