package Array;

import java.util.Scanner;

public class Score {
	
	public int Soultion(int num, int[] arr) {
		
		int score = 0;
		int con = 0;
		
		for(int i = 0; i<num; i++) {
			if(arr[i] == 0)	{
				con = 0;
				continue;
			}
			else {
				if(i == 0)	con = 1;
				else if(arr[i-1] == 1) {
					con++;
				} else con = 1;
				
				score = score + con;
			}
		}
		
		return score;
	}

	public static void main(String[] args) {
		
		Score main = new Score();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		int num = sc.nextInt();
		int arr[] = new int[num];
		
		for(int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print(main.Soultion(num, arr));
		
	}

}
