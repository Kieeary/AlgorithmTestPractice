package Array;

import java.util.Scanner;

public class Fibonacci {

	public void Solution(int num) {

		int a = 1;
		int b = 1;
		
		System.out.print(a + " "+ b + " ");
		
		for(int i = 2; i<num; i++) {
			int c = a+b;
			
			System.out.print(c + " ");
			
			a = b;
			b = c;
		}
	}

	public static void main(String[] args) {

		Fibonacci main = new Fibonacci();

		Scanner sc = new Scanner(System.in);

		System.out.print("입력:");
		int num = sc.nextInt();
		
		main.Solution(num);
	}
}
