package Step_01;

import java.util.Scanner;

public class _1008 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextInt();
		double B = sc.nextInt();
		
		if(0 < A && B < 10) {
			System.out.println((A / B));
		}
		else {
			return;
		}
	}

}
