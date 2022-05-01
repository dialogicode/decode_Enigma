package step06;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ_2562 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = 0;
		int num = 0;

		for (int i = 0; i < 9; i++) {
			int x = Integer.parseInt(br.readLine());
			if (x > max) {
				max = x;
				num = i + 1;
			}
		}
		
		System.out.println(max);
		System.out.println(num);
	}
}
