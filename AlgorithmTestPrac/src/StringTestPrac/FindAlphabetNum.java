package StringTestPrac;

import java.util.Scanner;

public class FindAlphabetNum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int ans = 0;
		
		System.out.print("문자열을 입력하세요: ");
		String sentence = scanner.next();
		
		System.out.print("문자를 입력하세요: ");
		String strToChar = scanner.next();
		
		char[] str = new char[101];
		char haveToFindAlphabet;
		
		int length = 0;
		length = sentence.length();
		
		for(int i=0; i<length; i++) {
			str[i] = sentence.charAt(i);
		}
		
		haveToFindAlphabet = strToChar.charAt(0);
		
		for(int j = 0; j < length; j++) {
			if(str[j] == haveToFindAlphabet || str[j] == (haveToFindAlphabet + 32) || str[j] == (haveToFindAlphabet -32))	ans++;
		}
    System.out.print(ans);

	}

}
