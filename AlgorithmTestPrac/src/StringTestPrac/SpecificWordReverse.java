package StringTestPrac;

import java.util.Scanner;

public class SpecificWordReverse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		int r = str.length() - 1;

		char[] arr = str.toCharArray();

		for (int i = 0; i < r; i++) {
			if ((arr[i] >= 'a' && arr[i] <= 'z') || (arr[i] >= 'A' && arr[i] <= 'Z')) {
				while (r >= i) {
					if ((arr[r] >= 'a' && arr[r] <= 'z') || (arr[r] >= 'A' && arr[r] <= 'Z')) {
						char tmp = arr[i];
						arr[i] = arr[r];
						arr[r] = tmp;
						r--;
						break;
					} else {
						r--;
					}
				}
			}
		}

		for (int i = 0; i < str.length(); i++) {
			String ans = Character.toString(arr[i]);

			System.out.print(ans);
		}
	}

}
