package StackNQueue;

import java.util.Scanner;
import java.util.Stack;

public class ParenthesisRemove {

	public String Solution(String str) {

		Stack<Character> stack = new Stack<>();
		String answer = "";

		for (char c : str.toCharArray()) {
			if (c != ')')
				stack.push(c);
			else {
				while (stack.pop() != '(') {
				}
			}
		}

		for (int i = 0; i < stack.size(); i++) {
			answer = answer + stack.get(i);
		}
		return answer;

	}

	public static void main(String[] args) {

		ParenthesisRemove main = new ParenthesisRemove();
		Scanner sc = new Scanner(System.in);

		System.out.print("입력: ");
		String str = sc.next();

		System.out.print(main.Solution(str));
	}

}
