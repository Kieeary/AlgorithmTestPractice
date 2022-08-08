package StringTestPrac;

import java.util.Scanner;

public class SecretCode {
	
	
	public void Solution(String str, int num) {
		
		String answer = "";
		
		for(int i = 0; i < num; i++) {
			String s = str.substring(0,7).replace("#", "1").replace("*", "0");

			answer = answer + (char)Integer.parseInt(s, 2);
			
			str = str.substring(7);
		}
		System.out.print(answer);
	}

	public static void main(String[] args) {

		SecretCode main = new SecretCode();
		
		Scanner sc = new Scanner(System.in);

		System.out.println("비밀 코드를 입력하세요: ");
		int num = sc.nextInt();

		System.out.println("코드 입력: ");
		String str = sc.next();
		
		main.Solution(str, num);
	}
}
