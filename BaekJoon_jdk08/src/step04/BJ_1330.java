package step04;

import java.util.Scanner;

public class BJ_1330 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		if(a > b) System.out.print(">");
		else if(a < b) System.out.print("<");
		else if(a == b) System.out.print("==");
	}
}
