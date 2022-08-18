package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class SalesCategory {

	public int[] Solution(int n, int m, int[] arr) {

		HashMap<Integer, Integer> map = new HashMap<>();
		int[] answer = new int[n - m + 1];
		int index = 1;

		for (int i = 0; i < m; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}

		answer[0] = map.size();

		while (index <= n - m) {
			map.put(arr[index - 1], map.get(arr[index - 1]) - 1);

			if (map.get(arr[index - 1]) == 0) {
				map.remove(arr[index - 1]);
			}

			map.put(arr[index + (m - 1)], map.getOrDefault(arr[index + (m - 1)], 0) + 1);
			answer[index] = map.size();
			index++;
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
