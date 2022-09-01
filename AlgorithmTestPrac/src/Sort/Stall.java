package Sort;

import java.util.Arrays;
import java.util.Scanner;

public class Stall {

	public int Solution(int n, int s, int[] arr) {
		
		int answer = 0;
		int lt = 1;
		int rt = Arrays.stream(arr).max().getAsInt();
		int mid = 0;
		int cnt = 1;
		
		Arrays.sort(arr);
		
		while(lt <= rt) {
			
			cnt = 1;
			mid = (lt + rt)/2;
			int tmp = arr[0];
				for(int j = 1; j<n; j++)  {
					if(arr[j] - tmp >= mid)	{
						tmp = arr[j];
						cnt++;
					}
				}
			if(cnt < s) {
				rt = mid-1;

			}
			else {
				lt = mid+1;
				answer = mid;
			}
			
		}
		return answer;
	}
	
	public static void main(String[] args) {
		
		Stall main = new Stall();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		int n = sc.nextInt();
		int s = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i =0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print(main.Solution(n, s, arr));		
	}

}
