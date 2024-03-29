package Sort;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateCheck {
	
	public char Solution(int[] arr) {
		
		char answer = 'U';
		Arrays.sort(arr);
		
		for(int i = 0; i<arr.length-1; i++) {
			if(arr[i] == arr[i+1])	return 'D';
		}
		
		return answer;
	}

	public static void main(String[] args) {

		DuplicateCheck main = new DuplicateCheck();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i =0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print(main.Solution(arr));
	}

}
