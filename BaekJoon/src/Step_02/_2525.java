package Step_02;

import java.util.Scanner;

public class _2525 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int min = B + C;
		
		A = A + (min / 60);
		B = min % 60;
		
		if(A >= 24) {
			A = A % 24;
		}
		
		System.out.println(A + " " + B);
	}
}
