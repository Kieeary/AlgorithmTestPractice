package Sort;

import java.util.Scanner;

public class BubbleSort {

	public int[] Solution(int n, int[] arr) {
		
		for(int i = 0; i < n-1; i++) {
			for(int j = 0; j<n-1; j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = tmp;			
				}
			}
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		
		BubbleSort main = new BubbleSort();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
	
		for(int i : main.Solution(n, arr)) {
			System.out.print(i + " ");
		}
	}

}
