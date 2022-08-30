package Sort;

import java.util.ArrayList;
import java.util.Scanner;

class Coordinate{
	
	int x;
	int y;
	
	public Coordinate(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class CoordinateAlignment {
	
	public Coordinate[] Solution(Coordinate[] al) {

		//삽입정렬
		for(int i =1; i<al.length; i++) {
			Coordinate tmp = al[i];
			int j = 0;
			for(j = i - 1; j>=0 ; j--) {
				if(tmp.x < al[j].x) {
					 al[j+1] = al[j];
					} 
				else if (tmp.x == al[j].x) {
					if(tmp.y < al[j].y) {
						al[j+1] = al[j];	
					} else break;
				}
				else break;
				}
			al[j+1] = tmp;
		}
		
		return al;
	}

	public static void main(String[] args) {

		CoordinateAlignment main = new CoordinateAlignment();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력: ");
		int n = sc.nextInt();
		Coordinate[] al = new Coordinate[n];
		
		for(int i = 0; i<n; i++) {
			al[i] = new Coordinate(sc.nextInt(), sc.nextInt()); 
		}
		
		for(Coordinate i : main.Solution(al)) {
			System.out.println(i.x + " " + i.y);
		}
		
	}

}
