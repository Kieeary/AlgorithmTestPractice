package StackNQueue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class EmergencyRoom {

	public int Solution(int N, int t, int M, ArrayList<Integer> ArrList, int[] arr) {

		Queue<Integer> q = new LinkedList<>();

		int answer = 0;

		for (int i : ArrList) {
			q.offer(i);
		}

		while (true) {
			for (int i = 0; i < arr.length; i++) {
				if (q.contains(arr[i])) {
					int tmp = q.poll();
					for (int j = 1; j < ArrList.size(); j++) {
						if (arr[i] < ArrList.get(j)) {
							ArrList.remove(0);
							ArrList.add(tmp);
							q.offer(tmp);
							break;
						} else if (i != M && j == ArrList.size() - 1) {
							answer++;
							ArrList.remove(0);
							
						} else if (i == M && j == ArrList.size() - 1) {
							answer++;
							return answer;
						}
					}
				} 
			}
		}
	}

	public static void main(String[] args) {

		EmergencyRoom main = new EmergencyRoom();

		Scanner sc = new Scanner(System.in);

		System.out.print("입력: ");
		int N = sc.nextInt();
		int M = sc.nextInt();
		int t = 0;

		int[] arr = new int[N];
		ArrayList<Integer> ArrList = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
			ArrList.add(arr[i]);
			if (i == M)
				t = arr[i];

		}

		System.out.print(main.Solution(N, t, M, ArrList, arr));

	}

}
