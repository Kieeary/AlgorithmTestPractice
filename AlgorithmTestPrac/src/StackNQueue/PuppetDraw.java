package StackNQueue;

import java.util.Scanner;
import java.util.Stack;

public class PuppetDraw {
	
	public int Solution(int N, int M, int[][] arr, int[] moves) {
		Stack<Integer> stack = new Stack<>();
		int answer = 0;
		
		int index = 0;
		
		for(int i = 0; i<moves.length; i++) {
			int minus = moves[i] - 1;
			while(index < N && arr[index][minus] == 0) {
				if(index == N-1)	break;
				
				else {
					System.out.println("[index][minus]: " + index + " " + minus);
					index++;
				}
				
			}
			
			if(arr[index][minus] != 0) {
				if(!stack.isEmpty() && (stack.peek() == arr[index][minus])) {
					answer++;
					System.out.println("peek: " + stack.peek());
					stack.pop();
				}
				else	
					stack.push(arr[index][minus]);
					System.out.println(stack.peek());
			}
			
			arr[index][minus] = 0;
			
			index = 0;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		
		PuppetDraw main = new PuppetDraw();

		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력: ");
		int N = sc.nextInt();
		int[][] arr = new int[N][N];
		
		for(int i = 0; i< N; i++) {
			for(int j = 0; j<N; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int M = sc.nextInt();
		int[] moves = new int[M];
		
		for(int i =0; i<M; i++) {
			moves[i] =sc.nextInt();
		}
		
		System.out.print(main.Solution(N, M, arr, moves));
	}

}
