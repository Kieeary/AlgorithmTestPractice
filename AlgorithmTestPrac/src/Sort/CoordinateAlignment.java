package Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Coordinate implements Comparable<Coordinate>{
	
	int x;
	int y;
	
	public Coordinate(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int compareTo(Coordinate c) {
		if(this.x == c.x)	return this.y-c.y;
		else return this.x - c.x;
	}
	
}

public class CoordinateAlignment {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력: ");
		int n = sc.nextInt();
		ArrayList<Coordinate> al = new ArrayList<>();
		
		for(int i =0; i<n; i++) {
			al.add(new Coordinate(sc.nextInt(), sc.nextInt()));
		}
		
		Collections.sort(al);
		
		for(Coordinate i : al) {
			System.out.println(i.x + " " + i.y);
		}
	}
}
