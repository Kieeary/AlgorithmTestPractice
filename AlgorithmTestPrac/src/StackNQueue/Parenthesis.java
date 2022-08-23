package StackNQueue;

import java.util.Scanner;
import java.util.Stack;

public class Parenthesis {

	public String Solution(String str) {
		
		Stack<Character> st = new Stack<>();
		String answer = "YES";
		
		for(char c : str.toCharArray()) {
			if(c == '(')	st.push(c);
			else {
				if(st.isEmpty()) {
					answer = "NO";
					return answer;
				} else st.pop();
			}
		}
		
		if(!st.isEmpty())	{
			answer = "NO";
			return answer;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		Parenthesis main = new Parenthesis();

		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력: ");
		String str = sc.next();
		
		System.out.print(main.Solution(str));
		
	}

}
