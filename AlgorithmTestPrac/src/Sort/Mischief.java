package Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Mischief {

	public ArrayList<Integer> Solution(int[] arr) {
		
		ArrayList<Integer> answer = new ArrayList<>();
		int[] copy = arr.clone();	
		
		Arrays.sort(arr);
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] != copy[i])	answer.add(i+1);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {

		Mischief main = new Mischief();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i =0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i : main.Solution(arr)) {
			System.out.print(i + " ");
		}
	}

}
