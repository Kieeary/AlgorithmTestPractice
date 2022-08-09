package Array;

import java.util.Scanner;

public class RSP {
	
	static Scanner sc = new Scanner(System.in);

	
	public char[] Solution(int num, int[] A, int[] B) {

		char[] answer = new char[num];
		
		for(int i = 0; i<num; i++) {
			if(A[i] == B[i]) {
				answer[i] = 'D';
			}
			else if(A[i] == 1) {
				if(B[i] == 2) {
					answer[i] = 'B';
				}
				if(B[i] == 3) {
					answer[i] = 'A';
				}
			}
			else if(A[i] == 2) {
				if(B[i] == 1) {
					answer[i] = 'A';
				}
				if(B[i] == 3) {
					answer[i] = 'B';
				}
			}
			else if(A[i] == 3) {
				if(B[i] == 1) {
					answer[i] = 'B';
				}
				if(B[i] == 2) {
					answer[i] = 'A';
				}
			}
		}
		
		System.out.print(answer); 
		return answer;
	}

	public static void main(String[] args) {

		RSP main = new RSP();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력: ");
		int num = sc.nextInt();
		
		int[] A = new int[num];
		int[] B = new int[num];
		
		for(int i = 0; i<num; i++) {
			A[i] = sc.nextInt();
		}
		
		for(int i = 0; i<num; i++) {
			B[i] = sc.nextInt();
		}
		
		for(char c : main.Solution(num, A, B)) {
			System.out.println(c);
		}
	}

}
