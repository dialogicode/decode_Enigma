package step04;

import java.util.Scanner;

public class BJ_2525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int term = sc.nextInt();
		sc.close();

		h += term / 60;
		m += term % 60;

		if (m >= 60) {
			m -= 60;
			h++;
		}

		if (h >= 24) h -= 24;

		System.out.printf("%d %d", h, m);
	}
}
