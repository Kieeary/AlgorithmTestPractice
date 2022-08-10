package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class ReversePrimeNumber {

	static Scanner sc = new Scanner(System.in);

	public ArrayList<Integer> Solution(int num, String[] arr) {

		ArrayList<Integer> answer = new ArrayList<Integer>();

		String[] revArr = new String[num];
		int[] revInt = new int[num];
		String k = "";

		for(int i=0; i<num; i++) {
			for(int index = arr[i].length()-1; index >= 0; index--) {
				k += arr[i].charAt(index);
				
			}
			revArr[i] = k;
			k = "";
		}
	
		for(int i =0; i<num; i++) {
			revInt[i] = Integer.parseInt(revArr[i]);
		}
		
		for(int i = 0; i<num; i++) {
			System.out.println(revInt[i] + " ");
		}
		
		

		for (int i = 0; i < num; i++) {
			for (int j = 2; j <= revInt[i]; j++) {
				if(revInt[i] == 1)	break;
				else if(revInt[i] == 2) {
					answer.add(revInt[i]);
					break;
				}
				else if (revInt[i] % j == 0)
					break;
				else {
					if(j == revInt[i] - 1) {
					answer.add(revInt[i]);
					}
				}
			}
		}

		return answer;

	}

	public static void main(String[] args) {

		ReversePrimeNumber main = new ReversePrimeNumber();
		
		System.out.print("입력 : " );
		int num = sc.nextInt();
		
		String[] arr = new String[num];
		for (int i = 0; i < num; i++) {
			arr[i] = sc.next();
		}
		

		for(int i : main.Solution(num, arr)) {
			System.out.print(i + " ");
		}
	}
}
