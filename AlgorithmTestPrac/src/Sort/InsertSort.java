package Sort;

import java.util.Scanner;

public class InsertSort {

	public int[] Solution(int n, int[] arr) {
		
		for(int i = 1; i<n; i++) {
			int tmp = arr[i];
			int j = 0;
			for(j = i-1 ; j >= 0; j--) {
				if(tmp < arr[j]) {
					arr[j+1] = arr[j];
				} else break;
			}
			arr[j+1] = tmp;
		}
		return arr;
	}
	
	public static void main(String[] args) {

		InsertSort main = new InsertSort();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력: ");
		int n = sc.nextInt();
		int [] arr = new int[n];
		
		for(int i =0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i : main.Solution(n, arr)) {
			System.out.print(i + " ");
		}
	}

}
