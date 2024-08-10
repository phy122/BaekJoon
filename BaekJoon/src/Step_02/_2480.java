package Step_02;

import java.util.Scanner;

public class _2480 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		 
		if(x == y &&  x == z) {
			int result =10000 + x * 1000;
			System.out.println(result);
		}
		else if(x == y && x != z || x == z && x != y) {
			int result2 = 1000 + x * 100;
			System.out.println(result2);
		}
		else if(y == z && y != x) {
			int result3 = 1000 + y * 100;
			System.out.println(result3);
		}
		else {
			int max = x;
			if(max < y) {
				max = y;
			}
			if(max < z) {
				max = z;
			}
			System.out.println(max * 100);
		}
	}
}
