import java.util.*;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public int Solution(int target) {
		int repeat = target;
		int answer = 0;

		while (true) {
			if (repeat < 10) {
				repeat = (10 * repeat) + repeat;
			} else {
				int tmp = (repeat / 10) + (repeat % 10);
				if (tmp < 10) {
					repeat = (repeat % 10) * 10 + tmp;
				} else {
					repeat = (repeat % 10) * 10 + (tmp % 10);
				}
			}
			answer++;
			if(repeat == target)	break;
		}
		return answer;
	}

	public static void main(String args[]) {

		Main main = new Main();
		int target = sc.nextInt();
		System.out.print(main.Solution(target));
	}
}