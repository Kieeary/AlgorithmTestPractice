package StringTestPrac;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseWord {
	
	static Scanner sc = new Scanner(System.in);
	
	public ArrayList<String> Solution(int num, String[] arr) {
//		ArrayList<String> ans = new ArrayList<>();
//		
//		for(String x : arr) {
//			String tmp = new StringBuilder(x).reverse().toString();
//			
//			ans.add(tmp);
//		}
		
		ArrayList<String> ans = new ArrayList<>();
		for(String x : arr) {
			char [] c = x.toCharArray();
			int lt = 0;
			int rt = x.length() - 1;
			
			while(lt<rt) {
				char tmp = c[lt];
				c[lt] = c[rt];
				c[rt] = tmp;
				lt++;
				rt--;
			}
			String tmp = String.valueOf(c);
			ans.add(tmp);
		}
		return ans;
	}

	public static void main(String[] args) {
		
		ReverseWord main = new ReverseWord();		
		
		int num = sc.nextInt();
		
		String[] str = new String[num];
		for(int i=0; i<num; i++) {
			str[i] = sc.next();
		}
		
		for(String x : main.Solution(num, str)) {
			System.out.println(x);
		}
	}

}