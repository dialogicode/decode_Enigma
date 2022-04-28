package step01;

import java.util.Scanner;

public class BJ_18108 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int buddhaYear = sc.nextInt();
		sc.close();
		
		int christYear = buddhaYear - 543;
		System.out.println(christYear);
	}
}
