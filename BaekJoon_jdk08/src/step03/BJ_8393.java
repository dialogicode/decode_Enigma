package step03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ_8393 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();

		System.out.println((n + 1) * n / 2);
	}
}
