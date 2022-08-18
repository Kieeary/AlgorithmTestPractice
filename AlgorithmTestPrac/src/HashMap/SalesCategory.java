package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class SalesCategory {

	public ArrayList<Integer> Solution(int n, int m, int[] arr) {

		HashMap<Integer, Integer> map = new HashMap<>();
		ArrayList<Integer> answer = new ArrayList<>();
		
		int lt = 0;
		int rt = 0;
		
		for(rt = 0; rt<m-1; rt++) {
			map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
		}
		
		for(int i = rt; rt<n; rt++) {
			map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
			answer.add(map.size());
			
			map.put(arr[lt], map.get(arr[lt])-1);
			if(map.get(arr[lt]) == 0)	map.remove(arr[lt]);
			
			lt++;
		}

		return answer;

	}

	public static void main(String[] args) {

		SalesCategory main = new SalesCategory();

		Scanner sc = new Scanner(System.in);

		System.out.print("입력 : ");
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i : main.Solution(n, m, arr)) {
			System.out.print(i + " ");
		}
	}

}
