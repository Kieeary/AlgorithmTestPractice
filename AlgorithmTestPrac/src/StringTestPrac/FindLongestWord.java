package StringTestPrac;

import java.util.Arrays;
import java.util.Scanner;

public class FindLongestWord {
	
	public String Solution(String str) {
		
		String ans = "";
		int min = Integer.MIN_VALUE;
		int length = 0;
		
		while((length = str.indexOf(" ")) != -1) {
			if(length + 1 > min) {
				min = length;
				ans = str.substring(0, length+1);
			}
			str = str.substring(length+1);
		}
		if(str.length() > min)	ans = str;
		
		//foreach문을 활용한 풀이	
//		int min = Integer.MIN_VALUE;
//		
//		String [] arr = str.split(" "); // 띄어쓰기를 기준으로 문자열 배열을 저장함
//		
//		for(String x : arr) {
//			if(x.length() > min) {
//				ans = x;
//				min = x.length();
//			}
//		}
		
		return ans;
	}

	public static void main(String[] args) {

		FindLongestWord main = new FindLongestWord();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요: ");
		String str = sc.nextLine();
		
		System.out.println(main.Solution(str));
	}
}
