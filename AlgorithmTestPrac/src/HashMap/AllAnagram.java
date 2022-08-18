package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class AllAnagram {
	
	public int Solution(String s, String t) {
		
		int lt = 0;
		int rt = 0;
		int cnt = 0;
		int answer = 0;
		
		HashMap<Character, Integer> map = new HashMap<>();
		HashMap<Character, Integer> test = new HashMap<>();
				
		for(char c : t.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		
		test.putAll(map);
		
		for(lt = 0; lt < s.length() - t.length() + 1; lt++) {
			int length = lt + t.length();
			for(rt = lt; rt < length; rt++) {	
				
				if(!map.containsKey(s.charAt(rt))) {
					break;
				}
				
				else {
					test.put(s.charAt(rt), test.get(s.charAt(rt)) - 1);
					
					if(test.get(s.charAt(rt)) == 0) {
						cnt++;
						
						if(cnt == test.size())	answer++;
					}
					
					else if(test.get(s.charAt(rt)) < 0)	break;
				}
			}
			
			cnt = 0;
			
			test.putAll(map);
		}

		return answer;
		
	}

	public static void main(String[] args) {

		AllAnagram main = new AllAnagram();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력: ");
		String s = sc.next();
		String t = sc.next();
		
		System.out.print(main.Solution(s, t));
		
	}

}
