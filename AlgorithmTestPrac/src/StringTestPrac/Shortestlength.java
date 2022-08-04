package StringTestPrac;

import java.util.Scanner;

public class Shortestlength {

	public int[] Solution(String str, char c) {

		int[] arr = new int[str.length()];

		int min = 1000;
		
		for(int i =0; i<str.length(); i++) {
			if(str.charAt(i) == c) {
				min = 0;
				arr[i] = min;
			} else {
				min++;
				arr[i] = min;
			}
		}
		
		min = 1000;
		
		for(int i = str.length()-1; i >= 0; i--) {
			if(str.charAt(i) == c) {
				min = 0;
			} else {
				min++;
				arr[i] = Math.min(arr[i], min);
			}
		}
		return arr;
	}

	public static void main(String[] args) {

		Shortestlength main = new Shortestlength();
		
		Scanner sc = new Scanner(System.in);

		System.out.println("문자열과 문자를 입력하세요: ");
		String str = sc.next();
		char c = sc.next().charAt(0);
		
		for(int x : main.Solution(str, c)) {
			System.out.print(x + " ");
		}

	}
}
