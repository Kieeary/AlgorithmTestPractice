package StackNQueue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PrincessSaving {
	
	public int Solution(int n, int k) {
		
		int answer = 0;
		int tmp = 0;
		
		Queue<Integer> queue1 = new LinkedList<>();
		Queue<Integer> queue2 = new LinkedList<>();
		
		for(int i = 1; i<= n; i++) {
			queue1.offer(i);
		}
		
		while(queue1.size()!= 1 && queue2.size() != 1) {

//			for(int i = 1; i< queue1.size(); i++) {
//				if(i % )
//			}
			
			for(Iterator<Integer> iterator = queue1.iterator(); iterator.hasNext();) {
				int index = iterator.next();
				tmp++;
				if(tmp % k == 0) {
					System.out.println("queue1 에서 삭제한 요소: " + queue1.peek());
					iterator.remove();
//					if(queue1.size() == 1)	{
//						break;
//					}

				} else {
					queue2.offer(queue1.peek());
					iterator.remove();
				}
			}
			
			if(queue1.size() == 1 && queue2.size() == 0)	break;
			else queue1.clear();
			
			for(Iterator<Integer> iterator = queue2.iterator(); iterator.hasNext();) {
				int index = iterator.next();
				tmp++;
				if(tmp % k == 0) {
					System.out.println("queue2 에서 삭제한 요소: " + queue2.peek());
					iterator.remove();
//					if(queue2.size() == 1)	break;
				} else {
					queue1.offer(queue2.peek());
					iterator.remove();
				}
			}
			
			if(queue2.size() == 1 && queue1.size() == 0)	break;
			else queue2.clear();
		}
		
		System.out.print("while문 빠져나옴");
		
		if(queue1.size() == 1) answer = queue1.peek();
		else answer = queue2.peek();
		
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
