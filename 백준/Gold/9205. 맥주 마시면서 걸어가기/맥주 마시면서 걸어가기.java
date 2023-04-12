import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static class Point {
		int x;
		int y;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	static void BFS(ArrayList<ArrayList<Integer>> al, Queue<Integer> q, int n) {

		// 방문했는지 안했는지 체크하는 배열 필요
		int[] ch = new int[n + 2];

		while (!q.isEmpty()) {

			int tmp = q.poll();
			ch[tmp] = 1;
			
	//		System.out.println("poll: " + tmp);

			if (tmp == n + 1) {
				System.out.println("happy");
				return;

			} else {

				for(Integer s : al.get(tmp)) {
					if(ch[s] != 1) {
						q.add(s);
						ch[s] = 1;
					}
				}
				// 1000m 이하인 거리 큐에 넣기
//				for (int i = 0; i < al.get(tmp).size(); i++) {
//					if (ch[i] != 1) {
//						q.add(al.get(tmp).get(i));
//						ch[i] = 1;
//					}
//				}
			}

		}
		System.out.println("sad");
		return;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		LinkedList<Point> l;
		ArrayList<ArrayList<Integer>> al;
		Queue<Integer> q;

		int t = sc.nextInt();
        int n = 0;
        
		for (int c = 0; c < t; c++) {
			n = sc.nextInt(); // 편의점 갯수
            
			l = new LinkedList<>();
			al = new ArrayList<>();
			q = new LinkedList<>();
			
			// 집부터 페스티벌까지의 모든 좌표를 list에 추가
			for (int i = 0; i < n + 2; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();

				l.add(new Point(x, y));
			}

			for (int i = 0; i < l.size(); i++) {
				al.add(new ArrayList<>());
			}

			// i에서 j 까지의 거리가 1000 이하인 좌표값을 서로 연결
			for (int i = 0; i < l.size(); i++) {
				for (int j = i + 1; j < l.size(); j++) {
					if (Math.abs(l.get(i).x - l.get(j).x) + Math.abs(l.get(i).y - l.get(j).y) <= 1000) {
	//					System.out.println("in: " + i +", " + j);

						al.get(i).add(j);
						al.get(j).add(i);
					}
				}
			}

			q.add(0);
			BFS(al, q, n);
		}
	}
}
