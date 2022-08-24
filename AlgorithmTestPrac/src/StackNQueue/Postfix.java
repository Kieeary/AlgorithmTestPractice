package StackNQueue;

import java.util.Scanner;
import java.util.Stack;

public class Postfix {

	public int Solution(String postfix) {

		int answer = 0;
		int tmp = 0;
		
		int front = 0;
		int rear = 0;

		Stack<Integer> stack = new Stack<>();

		for (char c : postfix.toCharArray()) {
			if (c != '+' && c != '-' && c != '*' && c != '/') {
				int i = c - 48;
				stack.push(i);
			} else {
				switch (c) {

				case '+':
					rear = stack.pop();
					front = stack.pop();
					tmp = front + rear;
					//System.out.println("push할 정수: " + tmp);
					stack.push(tmp);
					break;

				case '-':
					rear = stack.pop();
					front = stack.pop();
					tmp = front - rear;
					//System.out.println("push할 정수: " + tmp);
					stack.push(tmp);
					break;

				case '*':
					rear = stack.pop();
					front = stack.pop();
					tmp = front * rear;
					//System.out.println("push할 정수: " + tmp);
					stack.push(tmp);
					break;

				case '/':
					rear = stack.pop();
					front = stack.pop();
					tmp = front / rear;
					//System.out.println("push할 정수: " + tmp);
					stack.push(tmp);
					break;

				default:
					break;

				}
			}
		}
		
		answer = stack.pop();

		return answer;
	}

	public static void main(String[] args) {

		Postfix main = new Postfix();
		Scanner sc = new Scanner(System.in);

		System.out.print("입력 : ");
		String postfix = sc.next();
		
		System.out.print(main.Solution(postfix));
		
	}

}
