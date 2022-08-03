package StringTestPrac;

import java.util.Scanner;

public class DuplicateCharacterDelete {

	static Scanner sc = new Scanner(System.in);

	public String Solution(String str) {

		String newStr = "";
		
		for(int i = 0; i<str.length(); i++) {
			if(i == str.indexOf(str.charAt(i))) {
				newStr = newStr + str.charAt(i);
			}
		}
	
	return newStr;
	}

	public static void main(String[] args) {

		DuplicateCharacterDelete d = new DuplicateCharacterDelete();

		String str = sc.next();

		System.out.print(d.Solution(str));

	}

}
