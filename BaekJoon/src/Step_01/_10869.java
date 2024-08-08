package Step_01;

import java.util.Scanner;

public class _10869 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(1 <= A && B <= 10000) {
			System.out.println((A + B));
			System.out.println((A - B));
			System.out.println((A * B));
			System.out.println((A / B));
			System.out.println((A % B));
		}
		else {
			return;
		}
	}

}
