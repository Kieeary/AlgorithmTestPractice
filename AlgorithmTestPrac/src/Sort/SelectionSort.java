package Sort;

import java.util.Scanner;

public class SelectionSort {

	public int[] Solution(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[index] > arr[j]) {
					index = j; 
				}
			}
			int tmp = arr[i];
			arr[i] = arr[index];
			arr[index] = tmp;
		}
		return arr;
	}

	public static void main(String[] args) {

		SelectionSort main = new SelectionSort();
		Scanner sc = new Scanner(System.in);

		System.out.print("입력: ");
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for(int i : main.Solution(arr)) {
			System.out.print(i + " ");
		}
	}

}
