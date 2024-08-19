package Step_03;

import java.util.Scanner;

//구구단
public class _2739 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		if(N >= 1 && N <= 9) {
		
			for (int j = 1; j < 10; j++) {
				System.out.println(N + " * " + j + " = " + (N * j));
			}
		
		}
	}

}
