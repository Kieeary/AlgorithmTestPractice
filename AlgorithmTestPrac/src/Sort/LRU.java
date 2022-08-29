package Sort;

import java.util.Scanner;

public class LRU {
	
	public int[] Solution(int[] cache, int[] arr) {
		
		int tmpIdx = 0;
		int tmp = 0;
		
		for(int i = 0; i < arr.length; i++) {
			tmpIdx = cache.length-1;
			tmp = arr[i];
			for(int j = 0; j<cache.length; j++) {
				if(tmp == cache[j])	 {
					tmpIdx = j;
					break;
				}
			}
			
			for(int k = tmpIdx-1; k>=0; k--) {
				cache[k+1] = cache[k];
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
