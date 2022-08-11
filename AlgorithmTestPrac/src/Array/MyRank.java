package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class MyRank {
	
	public int[] Solution(int num, int[] arr) {
		
		ArrayList<Integer> rank = new ArrayList<>();
		int[] answer = new int[num];

		rank.add(arr[0]);
		
		for(int i = 1; i<num; i++) {
			for(int j = 0; j < rank.size(); j++) {
				if(rank.get(j) <= arr[i]) {
					rank.add(j, arr[i]); 
					break;
				} 
				else {
					if(j == rank.size() - 1) {
						rank.add(arr[i]);
						break;
					}
				}
			}
		}
		
		for(int i =0; i<num; i++) {
			answer[i] = rank.indexOf(arr[i]) + 1;
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
