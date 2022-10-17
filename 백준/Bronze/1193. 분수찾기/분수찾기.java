import java.util.Scanner;

public class Main {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = 1;
		int tmp = 1;

		int son = 0;
		int mom = 0;

		while (answer < n) {
			tmp++;
			answer += (tmp);
		}

		if (tmp % 2 == 0) {
			son = 1;
			mom = tmp;

		} else {
			mom = 1;
			son = tmp;
		}
		answer = answer - (tmp - 1);

		if (tmp % 2 == 0) {
			for (int i = 0; i < tmp; i++) {
				if (answer != n) {
					son++;
					mom--;
					answer++;
				}
			}
		} else {
			for (int i = 0; i < tmp; i++) {
				if (answer != n) {
					son--;
					;
					mom++;
					answer++;
				}
			}
		}
		System.out.print(son + "/" + mom);
	}
}