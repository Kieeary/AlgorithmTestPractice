package Sort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DuplicateCheck {
	
	public char Solution(int[] arr) {
		
		HashMap<Integer, Integer> h = new HashMap<>();
		char answer = 'U';
		
		for(int i = 0; i<arr.length; i++) {
			h.put(arr[i], h.getOrDefault(arr[i], 0) + 1);

		}
		
		for(int i =0; i<arr.length; i++) {
			if(h.get(arr[i]) > 1) {
				return 'D';
			}
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
