package Array;

import java.util.Scanner;

public class Fibonacci {

	public int Fibo(int num) {
		
		if(num == 1)	return 1;
		else if(num == 2)	return 1;
		else {
			return Fibo(num-2) + Fibo(num-1);
		}
	}

	public static void main(String[] args) {

		Fibonacci main = new Fibonacci();

		Scanner sc = new Scanner(System.in);

		System.out.print("입력:");
		int num = sc.nextInt();

		for(int i = 1; i<=num; i++) {
			System.out.print(main.Fibo(i) + " ");
		}
	}
}
