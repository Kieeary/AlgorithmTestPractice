package HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class KthNumber {
	
	public int Solution(int n, int k, int[] arr) {
		
		ArrayList<Integer>answer = new ArrayList<>();
		HashSet<Integer> ans = new HashSet<>();
		
		int lt = 0;
		int mt = 0;
		int rt = 0;
		
		int kthNumber = 0;
		
		for(lt = 0; lt< n-2; lt++) {
			for(mt= lt + 1; mt< n-1; mt++) {
				for(rt = mt + 1; rt<n; rt++) {
					int tmp = arr[lt] + arr[mt] + arr[rt];
					if(ans.add(tmp)) {
						answer.add(tmp);
					}
				}
			}
		}
		
		int[] sortArr = new int[answer.size()];
				
		for(int i = 0; i<sortArr.length; i++) {
			sortArr[i] = answer.get(i);
		}
		
		Arrays.sort(sortArr);
		
		if(sortArr.length > k) {
			kthNumber = sortArr[sortArr.length - k];
			return kthNumber;
		}
		else return -1;
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
