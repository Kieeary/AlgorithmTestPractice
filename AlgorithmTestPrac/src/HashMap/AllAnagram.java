package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class AllAnagram {
	
	public int Solution(String s, String t) {
			
		int lt = 0;
		int rt = 0;
		int answer = 0;
		int length = t.length()-1;
		
		HashMap<Character, Integer> map = new HashMap<>();
		HashMap<Character, Integer> com = new HashMap<>();
		
		for(char c : t.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		
		for(rt = 0; rt<length; rt++) {
			com.put(s.charAt(rt), com.getOrDefault(s.charAt(rt), 0) + 1);
		}
		
		for(int i = rt; i<s.length(); i++) {
			com.put(s.charAt(i), com.getOrDefault(s.charAt(i), 0) + 1);
			
			if(map.equals(com)) {
				answer++;
			}
			
			com.put(s.charAt(lt), com.get(s.charAt(lt)) - 1);
			if(com.get(s.charAt(lt)) == 0)	com.remove(s.charAt(lt));
			
			lt++;
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
