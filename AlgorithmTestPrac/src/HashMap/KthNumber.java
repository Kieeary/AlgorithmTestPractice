package HashMap;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class KthNumber {
	
	public int Solution(int n, int k, int[] arr) {
		
		TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());

		int kthNumber = 0;
		
		for(int i = 0; i< n; i++) {
			for(int j= i + 1; j< n; j++) {
				for(int s = j + 1; s<n; s++) {
					int tmp = arr[i] + arr[j] + arr[s];
					Tset.add(tmp);
				}
			}
		}
		
		for(int i : Tset) {
			kthNumber++;
			if(kthNumber == k) {
				return i;
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		
		KthNumber main = new KthNumber();

		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력: ");
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i =0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
	
		System.out.print(main.Solution(n ,k, arr));
	}

}
