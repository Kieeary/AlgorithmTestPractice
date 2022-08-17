package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class President {

	public char Solution(int n, String votes) {

		int max = 0;
		int[] alp = new int[5];
		char answer = ' ';
		HashMap<Character, Integer> hash = new HashMap<Character, Integer>();

		for (char i : votes.toCharArray()) {
			switch (i) {

			case 'A':
				alp[0] = alp[0] + 1;
				break;
			case 'B':
				alp[1] = alp[1] + 1;
				break;
			case 'C':
				alp[2] = alp[2] + 1;
				break;
			case 'D':
				alp[3] = alp[3] + 1;
				break;
			case 'E':
				alp[4] = alp[4] + 1;
				break;

			default:
				break;
			}

		}

		for (int i = 0; i < 5; i++) {
			switch (i) {

			case 0:
				hash.put('A', alp[i]);
				break;
			case 1:
				hash.put('B', alp[i]);
				break;
			case 2:
				hash.put('C', alp[i]);
				break;
			case 3:
				hash.put('D', alp[i]);
				break;
			case 4:
				hash.put('E', alp[i]);
				break;

			default:
				break;
			}
		}
		
		for(Map.Entry<Character, Integer> pair : hash.entrySet()) {
			if(pair.getValue() > max)	{
				answer = pair.getKey();
				max = pair.getValue();
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
