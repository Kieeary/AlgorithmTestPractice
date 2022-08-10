package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumber {

	public int Solution(int num) {

		ArrayList<Integer> answer = new ArrayList<Integer>();

		answer.add(2);
		
		if(num > 2) {
			answer.add(3);
			
			for(int i = 4; i< num; i++) {
				for(int j = 0; j<answer.size(); j++) {
					if(i % answer.get(j) == 0)	break;
					
					else if(j == answer.size()-1) {
						answer.add(i);
						break;
					}
				}
			}
		}

		return answer.size();
	}

	public static void main(String[] args) {

		PrimeNumber main = new PrimeNumber();
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		System.out.print(main.Solution(num));
		
	}


}
