package Array;

import java.util.Scanner;

public class BiggerNumber {
	
	public void Solution(int num, int[] arr) {
		
		System.out.print(arr[0] + " ");
		
		for(int i =1; i<num; i++) {
			if(arr[i-1] <arr[i])	System.out.print(arr[i] + " ");
			
			else continue;
		} 
	}

	public static void main(String[] args) {
		
		BiggerNumber main = new BiggerNumber();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		int arr[] = new int[num];
		
		for(int i = 0; i< num; i++) {
			arr[i] = sc.nextInt();
		}
		
		main.Solution(num, arr);
		
	}

}
