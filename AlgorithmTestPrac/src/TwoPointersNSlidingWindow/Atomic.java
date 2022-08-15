package TwoPointersNSlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Atomic {

	public ArrayList<Integer> Solution(int num1, int num2, int[] arr1, int[] arr2) {

		int p1 = 0;
		int p2 = 0;
		
		ArrayList<Integer> answer = new ArrayList<Integer>();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		while(p1 < num1 && p2 < num2) {
			if(arr1[p1] == arr2[p2]) {
				answer.add(arr1[p1]);
				p1++;
				p2++;
			}
			else if(arr1[p1] > arr2[p2]) {
				p2++;
			}
			else p1++;
		}
		
		return answer;
	}

	public static void main(String[] args) {

		Atomic main = new Atomic();
		Scanner sc = new Scanner(System.in);

		System.out.print("입력 :");
		int num1 = sc.nextInt();
		int[] arr1 = new int[num1];
		for (int i = 0; i < num1; i++) {
			arr1[i] = sc.nextInt();
		}

		int num2 = sc.nextInt();
		int[] arr2 = new int[num2];
		for (int i = 0; i < num2; i++) {
			arr2[i] = sc.nextInt();
		}

		for(int i : main.Solution(num1, num2, arr1, arr2)) {
			System.out.print(i + " ");
		}
	}

}
