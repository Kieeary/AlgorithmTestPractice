package StringTestPrac;

import java.util.Scanner;

public class ReverseWord {
	
	static Scanner sc = new Scanner(System.in);
	
	public void Solution(int num) {
		String[] str = new String[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("문자열을 입력하세요: ");
			str[i] = sc.next();
		}
		
		String[] ans = new String[num];
		
		for(int i=0; i<num; i++) {
			int length = str[i].length();
			ans[i] = "";
			
			for(int n=0; n<length; n++) {
				ans[i] = ans[i] + str[i].charAt(length-1-n); //마지막 문자부터 추출
			}
		}
		
		for(int i=0; i<num; i++) {
			System.out.println(ans[i]);
		}
	}

	public static void main(String[] args) {
		
		ReverseWord main = new ReverseWord();
		System.out.print("정수를 입력하세요: ");
		int num = sc.nextInt();
	
		main.Solution(num);
		
	}

}