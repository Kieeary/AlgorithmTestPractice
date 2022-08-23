package StackNQueue;

import java.util.Scanner;
import java.util.Stack;

public class Parenthesis {

	public String Solution(String str) {
		
		Stack<Character> st = new Stack<>();
		char[] arr = str.toCharArray();
		String answer = "YES";
		
		for(int i = 0; i< arr.length; i++) {
			if(arr[i] == '(')	st.add(arr[i]);
			else if(arr[i] == ')')	{
				if(!st.isEmpty())	st.pop();
				else {
					answer = "NO";
					return answer;
				}
			}
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
