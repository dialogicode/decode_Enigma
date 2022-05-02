package step05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ_1065 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();
		
		int cnt = 0;

		for (int i = 1; i <= n; i++) {
			if (i < 100) cnt++;
			if (i >= 100 && i < 1000){
				int a = i / 100;
				int b = (i / 10) % 10;
				int c = i % 10;

				if (a + c == 2 * b) cnt++;
			}
		}

		System.out.println(cnt);
	}
}
