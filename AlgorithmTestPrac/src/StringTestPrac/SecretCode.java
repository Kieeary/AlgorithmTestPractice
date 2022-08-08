package StringTestPrac;

import java.util.Scanner;

public class SecretCode {
	
	
	public void Solution(String str, int num) {
		
		int res = 1;

		int result = 0;

		int k = 0;

		for (int i = 1; i <= num; i++) {
			for (int j = 0 + (7 * (i - 1)); j < 7 * i; j++) {
				if (str.charAt(j) == '#') {
					for (int s = 0; s < 6 - (j % 7); s++) {
						res = res * 2;

//						System.out.println("s: " + s);
//						System.out.println(res);
					}

				} else {
					continue;
				}
				result = result + res;
				res = 1;
//				System.out.println("j: " + j);
//				System.out.println("result: " + result);
			}
			System.out.printf("%c", result);
//			System.out.println("=================================");
			result = 0;
		}
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
