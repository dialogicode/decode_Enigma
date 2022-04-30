package step04;

import java.util.Scanner;

public class BJ_2753 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		sc.close();

		boolean isLeap = false;
		if (year % 4 == 0 && (year % 100 != 0 || year %400 == 0)) isLeap = true;

		System.out.println(isLeap ? 1 : 0);
	}
}
