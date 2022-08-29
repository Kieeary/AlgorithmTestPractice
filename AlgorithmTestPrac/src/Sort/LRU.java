package Sort;

import java.util.Scanner;

public class LRU {
	
	public int[] Solution(int[] cache, int[] arr) {
				
		for(int i : arr) {
			int tmpIdx = cache.length-1;
			int tmp = i;
			for(int j = 0; j<cache.length; j++) {
				if(i == cache[j]) {
					tmpIdx = j;
					break;
				}
			}
			for(int k = tmpIdx; k >= 1; k--) {
				cache[k] = cache[k-1];
			}
			cache[0] = tmp;
		}
		
		return cache;
	}

	public static void main(String[] args) {

		LRU main = new LRU();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력: ");
		int s = sc.nextInt();
		int n = sc.nextInt();
		int[] cache = new int[s];
		int[] arr = new int[n];
		
		for(int i =0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i : main.Solution(cache, arr)) {
			System.out.print(i + " ");
		}
	}

}
