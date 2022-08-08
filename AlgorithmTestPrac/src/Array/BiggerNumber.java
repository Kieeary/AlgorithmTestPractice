package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class BiggerNumber {
	
	public ArrayList<Integer> Solution(int num, int[] arr) {
		
		ArrayList<Integer> answer = new ArrayList<>();
		
		answer.add(arr[0]);
		
		for(int i =1; i<num; i++) {
			if(arr[i-1] <arr[i])	answer.add(arr[i]);
			
			else continue;
		}
		return answer;
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
		
		for(int i : main.Solution(num, arr)) {
			System.out.print(i + " ");
		}
		
	}

}
