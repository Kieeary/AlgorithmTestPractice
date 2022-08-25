package StackNQueue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PrincessSaving {
	
	public int Solution(int n, int k) {
		
		int answer = 0;
		
		Queue<Integer> queue = new LinkedList<>();
		
		for(int i = 1; i<=n; i++) {
			queue.offer(i);
		}
		
		while(!queue.isEmpty()) {
			for(int i =1; i<k; i++)	queue.offer(queue.poll());
			queue.poll();
			if(queue.size() == 1)	answer = queue.poll();
		}

		return answer;
		
	}

	public static void main(String[] args) {

		PrincessSaving main = new PrincessSaving();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 :");
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		System.out.print(main.Solution(n, k));
		
	}

}
