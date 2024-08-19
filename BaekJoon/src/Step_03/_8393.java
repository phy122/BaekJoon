package Step_03;

import java.util.Scanner;

//합
public class _8393 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
