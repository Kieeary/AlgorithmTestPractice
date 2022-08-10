package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumber {

	public int Solution(int num) {

		int result = 0;
		int[] answer = new int[num+1];
		
		for(int i = 0; i<=num; i++) {
			answer[i] = 0;
		}
		
		for(int i = 2; i<=num; i++) {
			if(answer[i] == 0) {
				result++;
				for(int j = i; j<=num; j= j+i)  {
					answer[j] = 1;
				}
			}
		}
		
		return result;
		
	}

	public static void main(String[] args) {

		PrimeNumber main = new PrimeNumber();
		Scanner sc = new Scanner(System.in);

		System.out.print("입력: ");
		int num = sc.nextInt();

		System.out.print(main.Solution(num));
		
	}

}
