package TwoPointersNSlidingWindow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Atomic {

	public ArrayList<Integer> Solution(int num1, int num2, int[] arr1, int[] arr2) {

		HashSet<Integer> answer = new HashSet<Integer>();
		HashSet<Integer> hs2 = new HashSet<Integer>();
		
		for(int i=0; i<num1; i++) {
			answer.add(arr1[i]);
		}
		
		for(int i=0; i<num2; i++) {
			hs2.add(arr2[i]);
		}
		
		answer.retainAll(hs2);
		ArrayList<Integer> result = new ArrayList<Integer>(answer);
		
		Collections.sort(result);

		
		return result;
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
