package StringTestPrac;

import java.util.Scanner;

public class StringCompress {

	public String Solution(String str) {

		String newStr = "";

		str = str + " ";
		
		int num = 1;

		for (int i = 0; i < str.length()-1; i++) {
			if (str.charAt(i) != str.charAt(i+1)) {
				newStr = newStr + str.charAt(i);
				if(num > 1)	newStr = newStr + String.valueOf(num);
				
				num = 1;

			} else {
				num++;
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
