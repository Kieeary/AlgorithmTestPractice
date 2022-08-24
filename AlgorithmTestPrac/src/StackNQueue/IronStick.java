package StackNQueue;

import java.util.Scanner;
import java.util.Stack;

public class IronStick {

	public int Solution(String stick) {
		
		int answer = 0;
		Stack<Character> stack = new Stack<>();
		
		for(int i =0 ; i<stick.length(); i++) {
			if(stick.charAt(i) == '(')	stack.push(stick.charAt(i));
			else {
				stack.pop();
				if(stick.charAt(i-1) == '(')	answer = answer + stack.size();
				else answer = answer + 1;
			}
		}
		
		return answer;
		
	}
	
	public static void main(String[] args) {

		IronStick main = new IronStick();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		String stick = sc.next();
		
		System.out.print(main.Solution(stick));
		
	}

}
