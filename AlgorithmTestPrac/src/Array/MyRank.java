package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class MyRank {
	
	public int[] Solution(int num, int[] arr) {
		
		int[] answer = new int[num];
		int rank = 1;
		
		for(int i = 0; i<num; i++) {
			for(int j = 0; j<num; j++) {
				if(arr[i] < arr[j]) {
					rank++;
				}
			}
			answer[i] = rank;
			rank = 1;
		}
		
		return answer;
		
	}	
	
	public static void main(String[] args) {

		MyRank main = new MyRank();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		
		for(int i =0; i<num; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i : main.Solution(num, arr)){
			System.out.print(i + " ");
		}
	}

}
