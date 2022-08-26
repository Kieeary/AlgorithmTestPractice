package StackNQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person {
	int id;
	int priority;

	public Person(int id, int priority) {
		this.id = id;
		this.priority = priority;
	}
}

public class EmergencyRoom {

	public int Solution(int N, int M, int[] arr) {

		int answer = 0;
		Queue<Person> Q = new LinkedList<>();

		for (int i = 0; i < N; i++) {
			Q.add(new Person(i, arr[i]));
		}

		while (!Q.isEmpty()) {
			Person tmp = Q.poll();
			for (Person p : Q) {
				if (tmp.priority < p.priority) {
					Q.offer(tmp);
					tmp = null;
					break;
				}
			}
			if (tmp != null) {
				answer++;
				if (tmp.id == M)
					return answer;
			}
		}
		return answer;

	}

	public static void main(String[] args) {

		EmergencyRoom main = new EmergencyRoom();

		Scanner sc = new Scanner(System.in);

		System.out.print("입력: ");
		int N = sc.nextInt();
		int M = sc.nextInt();

		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print(main.Solution(N, M, arr));

	}

}
