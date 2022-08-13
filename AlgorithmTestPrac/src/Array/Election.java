package Array;

import java.util.Scanner;

public class Election {
	
	public int Solution(int num, int[][] arr) {
		
		int result[][] = new int[num][num];
		
		int max = Integer.MIN_VALUE;
		int answer = 0;
		
		for(int i = 0; i<num; i++) {
			for(int j=0; j<5; j++) {
				for(int k=0; k <num; k++) {
					if(arr[i][j] == arr[k][j]) {
						result[i][k] = 1;
					}
				}
				
			}
		}
		
		for(int i =0; i<num; i++) {
			int tmp = 0;
			for(int j=0; j<num; j++) {
				if(result[j][i] == 1)	tmp++;
			
			}
			
			if(tmp > max)	{
				max = tmp;
				answer = i+1;
			}
		}
		
		return answer;
		
	}

	public static void main(String[] args) {
		
		Election main = new Election();

		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력: ");
		int num = sc.nextInt();
		int[][] arr = new int [num][5];
		
		for(int i =0; i<num; i++) {
			for(int j =0; j<num; j++) {
			arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.print(main.Solution(num, arr));
	}

}
