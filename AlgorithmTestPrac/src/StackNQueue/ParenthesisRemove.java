package StackNQueue;

import java.util.Scanner;
import java.util.Stack;

public class ParenthesisRemove {
	
	public char[] Solution(String str) {
		
		Stack<Character> stack = new Stack<>();
		
		char[] ch = str.toCharArray();
		
		for(int i = 0; i<ch.length; i++) {
			if(ch[i] != ')')	{
				stack.push(ch[i]);
			}
			else if(ch[i] == ')') {
				while(stack.pop() != '(') {
					
				}
			}
		}
		
		char[] answer = new char[stack.size()];
		
		for(int i = answer.length-1; i>= 0; i--) {
			answer[i] = stack.pop();
		}
		
		return answer;
	}

	public static void main(String[] args) {

		ParenthesisRemove main = new ParenthesisRemove();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력: ");
		String str = sc.next();
		
		for(char c : main.Solution(str)) {
			System.out.print(c + " ");
		}
	}

}
