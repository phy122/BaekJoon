package Step_01;

import java.util.Scanner;

public class _1000 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(0 < A && B < 10) {
			System.out.println((A + B));
		}
		else {
			return;
		}
	}
	

}
