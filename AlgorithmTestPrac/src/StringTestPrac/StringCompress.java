package StringTestPrac;

import java.util.Scanner;

public class StringCompress {

	public String Solution(String str) {

		String newStr = "";

		newStr = newStr + str.charAt(0);
		int num = 1;

		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i - 1) != str.charAt(i)) {
				if (num != 1) {
					newStr = newStr + num;
					num = 1;
				}
				newStr = newStr + str.charAt(i);

			} else {
				num++;
				if (i == str.length() - 1)
					newStr = newStr + num;
			}
		}
		return newStr;
	}

	public static void main(String[] args) {

		StringCompress main = new StringCompress();

		Scanner sc = new Scanner(System.in);

		System.out.print("문자열입력: ");
		String str = sc.next();

		System.out.println(main.Solution(str));
	}

}
