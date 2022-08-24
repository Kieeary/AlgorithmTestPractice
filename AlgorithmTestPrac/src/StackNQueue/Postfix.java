package StackNQueue;

import java.util.Scanner;
import java.util.Stack;

public class Postfix {

	public int Solution(String postfix) {

		int answer = 0;

		Stack<Integer> stack = new Stack<>();

		for (char c : postfix.toCharArray()) {
			if (Character.isDigit(c)) {
				int i = c - 48;
				stack.push(i);
			} else {

				int rear = stack.pop();
				int front = stack.pop();

				if (c == '+')
					stack.push(front + rear);
				else if (c == '-')
					stack.push(front - rear);
				else if (c == '*')
					stack.push(front * rear);
				else if (c == '/')
					stack.push(front / rear);
			}
		}

		answer = stack.get(0);

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