package StringTestPrac;

import java.util.Arrays;
import java.util.Scanner;

public class FindLongestWord {
	
	public String Solution(String str) {
		
		String str1 = "";
		String str2 = "";
				
		String ans = "";
		
		char [] arr = str.toCharArray();
		
		System.out.println(arr.length);
		System.out.println(str.length());
		
		int index = 0;
		
		while((arr[index] >= 65 && arr[index] <= 90) || (arr[index] >= 97 && arr[index] <= 122 )) {
			str1 = str1 + arr[index];
			index++;
			if(index >= str.length())	break;
		} // 첫번째 단어 저장
		
		if(index < str.length()) {
		
		index++; // 공백에 해당하는 인덱스는 무시
		
		while((arr[index] >= 65 && arr[index] <= 90) || (arr[index] >= 97 && arr[index] <= 122 )) {
			str2 = str2 + arr[index];
			index++;
			if(index == str.length())	break;
		} //두번째 단어 저장
				
		if(str1.length() > str2.length()) {
			ans = str1;
		} else ans = str2; //  두 단어중 긴 단어가 ans에 저장되어있음
				
		String str3 = "";
		
		index++;
		
		while(index < str.length()) {
		while((arr[index] >= 65 && arr[index] <= 90) || (arr[index] >= 97 && arr[index] <= 122 )) {
				str3 = str3 + arr[index];
				
				index++;
				if(index >= str.length())	break;
		}
		
		if(str3.length() > ans.length()) {
			ans = str3;
			str3 = "";
		} else {
			str3 = "";
		}
		
		if(index == str.length())	break;
		index++;
		}
		} else ans = str1;
				
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
