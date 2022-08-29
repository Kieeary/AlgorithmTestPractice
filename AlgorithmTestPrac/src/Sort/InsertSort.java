package Sort;

import java.util.Scanner;

public class InsertSort {

	public int[] Solution(int n, int[] arr) {
		
		for(int i = 1; i<n; i++) {
			for(int j = 0; j<i; j++) {
				if(arr[i] < arr[j]) {
					int tmp = arr[j];
					arr[j] = arr[i];
					arr[i] = tmp;
				}
			}
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
