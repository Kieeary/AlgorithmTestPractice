package Sort;

import java.util.Arrays;
import java.util.Scanner;

public class MusicVideo {
	
	public int count(int[] arr, int mid) {
		
		int size = 0;
		int cnt = 1;
		
		for(int i = 0; i< arr.length; i++) {
			
			if(size + arr[i] <= mid) {
				size = size + arr[i];
			} else {
				size = arr[i];
				cnt++;
			}
		}
		System.out.println("cnt: " + cnt);
		return cnt;
	}

	public int Solution(int n, int m, int[] arr) {

		int answer = 0;
		int lt = Arrays.stream(arr).max().getAsInt();
		int rt = Arrays.stream(arr).sum();
		int mid = 0;

		while(lt <= rt) {
			
			mid = (lt + rt)/2;
			
			if(count(arr, mid) <= m) {
				answer = mid;
				rt = mid -1;
			} else lt = mid + 1;	
		}
		return answer;

	}

	public static void main(String[] args) {

		MusicVideo main = new MusicVideo();
		Scanner sc = new Scanner(System.in);

		System.out.print("입력 : ");
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print(main.Solution(n, m, arr));

	}

}
