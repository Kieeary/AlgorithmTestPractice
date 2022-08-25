package StackNQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Curriculum {
	
	public String Solution(String str1, String str2) {
		
		String answer = "YES";
		
		Queue<Character> Q = new LinkedList<>();
		
		for(char c : str1.toCharArray())	Q.offer(c);
		for(char c: str2.toCharArray()) {
			if(Q.contains(c)) {
				if(Q.poll() != c)	return "NO";	
			}
		}
		if(!Q.isEmpty())	return "NO"; 
		
		return answer;
	}

	public static void main(String[] args) {
		
		Curriculum main = new Curriculum();

		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 :");
		String str1 = sc.next();
		String str2 = sc.next();
		
		System.out.print(main.Solution(str1, str2));
	}

}
