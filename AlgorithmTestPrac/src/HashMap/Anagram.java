package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Anagram {

	public String Solution(String str1, String str2) {

		String answer = "YES";

		HashMap<Character, Integer> map1 = new HashMap<>();
		HashMap<Character, Integer> map2 = new HashMap<>();

		for (char key : str1.toCharArray()) {
			map1.put(key, map1.getOrDefault(key, 0) + 1);
		}

		for (char key : str2.toCharArray()) {
			map2.put(key, map2.getOrDefault(key, 0) + 1);
		}
	
		for (char key1 : map1.keySet()) {
			if (!map2.containsKey(key1)) {
				answer = "NO";
				return answer;
			} else {
				for (char key2 : map2.keySet()) {
					if (key1 != key2)
						continue;

					else if (key1 == key2 && map2.get(key2) != map1.get(key1)) {
						answer = "NO";
						return answer;
					}
				}
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
