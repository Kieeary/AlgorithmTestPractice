package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Anagram {

	public String Solution(String str1, String str2) {

		String answer = "YES";
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char c : str1.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		
		for(char c : str2.toCharArray()) {
			if(!map.containsKey(c) || map.get(c) == 0) {
				answer = "NO";
				return answer;	
			}
			else {
				map.put(c, map.get(c) - 1); 
			}
		}
		

		return answer;
	}

	public static void main(String[] args) {

		Anagram main = new Anagram();

		Scanner sc = new Scanner(System.in);

		System.out.print("입력: ");
		String str1 = sc.next();
		String str2 = sc.next();

		System.out.print(main.Solution(str1, str2));
	}

}
