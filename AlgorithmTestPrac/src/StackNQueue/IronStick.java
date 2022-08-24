package StackNQueue;

import java.util.Scanner;
import java.util.Stack;

public class IronStick {

	public int Solution(String stick) {
		
		int answer = 0;
		boolean before = false;
		Stack<Character> stack = new Stack<>();
		
		for(char c : stick.toCharArray()) {
			if(c == '(') {
				stack.push(c);
				before = true;
			} else if(before == false && c == ')'){ // 쇠구슬 
				stack.pop();
				answer = answer + 1;
				before = false;
			} else if(before == true && c == ')') { // 레이저
				stack.pop();
				answer = answer + stack.size();
				before = false;
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

//(((()(()()))(())()))   (()())
