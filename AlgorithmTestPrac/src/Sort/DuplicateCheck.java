package Sort;

import java.util.ArrayList;
import java.util.Scanner;

public class DuplicateCheck {
	
	public char Solution(int[] arr) {
		
		ArrayList<Integer> al = new ArrayList<>();
		char answer = 'U';
		
		for(int i =0; i<arr.length; i++) {
			al.add(arr[i]);
		}
		
		for(int i = 0; i<arr.length; i++) {
			int tmp = al.get(0);
			al.remove(0);
			if(al.contains(tmp))	return 'D';
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
