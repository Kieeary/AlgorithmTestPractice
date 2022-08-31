package Sort;

import java.util.Scanner;

public class MusicVideo {

	public int Solution(int n, int m, int[] arr) {

		int answer = 0;
		int lt = Integer.MIN_VALUE;
		int rt = 0;
		int mid = 0;
		int cnt = 0;
		int size =0;
		
		for(int i =0; i<n; i++) {
			rt = rt + arr[i];
			if(lt < arr[i])	lt = arr[i];
		}
		
		System.out.println(lt + " " + rt);

		
		while(lt <= rt) {
			
			cnt = 0;
			size = 0;
			mid = (lt + rt)/2;
			
			for(int i =0; i<n; i++) {
				
				size = size + arr[i];				
				if(size > mid) {
					size = size - arr[i];
					cnt++;
					i--;
					size = 0;
				}
				
				if(i == n-1) cnt++;
			}
			
			if(cnt <= m)	{
				answer = mid;
				rt = mid -1;
			}
			
			else lt = mid+1;
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
