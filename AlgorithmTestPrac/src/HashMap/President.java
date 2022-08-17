package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class President {

	public char Solution(int n, String votes) {

		int max = 0;
		char answer = ' ';
		
		HashMap<Character, Integer> hash = new HashMap<>();
		
		for(char x : votes.toCharArray()) {
			hash.put(x, hash.getOrDefault(x, 0) + 1);
		}
		
		for(char x : hash.keySet()) {
			if(hash.get(x) > max)	{
				max = hash.get(x);
				answer = x;
			}
		}
		return answer;
	}

	public static void main(String[] args) {

		President main = new President();
		Scanner sc = new Scanner(System.in);

		System.out.print("입력: ");
		int n = sc.nextInt();
		String votes = sc.next();

		System.out.printf("%c", main.Solution(n, votes));
	}

}
