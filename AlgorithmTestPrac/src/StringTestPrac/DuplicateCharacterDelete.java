package StringTestPrac;

import java.util.Scanner;

public class DuplicateCharacterDelete {

	static Scanner sc = new Scanner(System.in);

	public String Solution(String str) {

		String newStr = "";

		int flag = 0;

		char[] strTochar = str.toCharArray();

		newStr = newStr + strTochar[0];

		for (int i = 1; i < strTochar.length; i++) {
			for (int j = 0; j < newStr.length(); j++) {
				if (strTochar[i] == newStr.charAt(j)) {
					flag = 1;
				}
			}

			if (flag == 0) {
				newStr += strTochar[i];
			}
			flag = 0;
		}

		return newStr;

	}

	public static void main(String[] args) {

		DuplicateCharacterDelete d = new DuplicateCharacterDelete();

		String str = sc.next();

		System.out.print(d.Solution(str));

	}

}
