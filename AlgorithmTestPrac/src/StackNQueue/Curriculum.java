package StackNQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Curriculum {
	
	public String Solution(String str1, String str2) {
		
		Queue<Character> Q = new LinkedList<>();
		Queue<Character> Q2 = new LinkedList<>();
		
		int index = 0;
		String answer = "YES";
		
		for(int i = 0; i<str2.length(); i++) {
			Q2.offer(str2.charAt(i));
		}
		
		for(char c : str1.toCharArray()) {
			for(int i = index; i<str2.length(); i++) {
				if(c == str2.charAt(i)) {
					Q.offer(Q2.poll());
					index++;
					break;
				}
				else {
					Q2.poll();
					index = i + 1;
				}
			}
		}
		
		index = 0;
		
		if(Q.size() == str1.length()) {
		while(index < str1.length() && !Q.isEmpty()) {
			if(Q.peek() == str1.charAt(index))	{
				Q.poll();
				index = index+1;
				continue;
			}
			else {
				Q.poll();
				answer = "NO";
				return answer;
			}
		}
		} else {
			answer = "NO";
			return answer;
		}
		
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
