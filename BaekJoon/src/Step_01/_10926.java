package Step_01;

import java.util.Scanner;

public class _10926 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name = sc.nextLine();
		
		if(name.length() <=50) {
			System.out.println(name + "??!");
		}
		else {
			return;
		}
	}

}
