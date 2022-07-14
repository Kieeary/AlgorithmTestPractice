package StringTestPrac;

import java.util.Scanner;

public class SpecificWordReverse {
  
  public String Solution(String str){
    
    	int l = 0;
		int r = str.length() - 1;
    	
    	String ans = "";

		char[] arr = str.toCharArray();

		while(l<r) {
			if(!Character.isAlphabetic(arr[l]))	l++;
			else if(!Character.isAlphabetic(arr[r]))	r--;
			else {
				char tmp = arr[l];
				arr[l] = arr[r];
				arr[r] = tmp;
				l++;
				r--;
			}
		}
		
		ans = String.valueOf(arr);

    	return ans;
  }

	public static void main(String[] args) {

		SpecificWordReverse main = new SpecificWordReverse();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
      
      	System.out.println(main.Solution(str));

	}

}
