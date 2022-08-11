package Array;

import java.util.Scanner;

public class Score {
	
	public int Soultion(int num, int[] arr) {
		
		int score = 0;
		int con = 0;
		
		for(int i = 0; i<num; i++) {
			if(arr[i] == 1) {
				con++;
				score = score + con;
			}
			else con = 0;
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
