package step06;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 88ms
public class BJ_3052_1 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] list = new int[42];

		for (int i = 0; i < 10; i++) {
			int num = Integer.parseInt(br.readLine()) % 42;
			list[num]++;
		}
		
		br.close();

		int cnt = 0;
		for (int i : list) {
			if (i != 0) cnt++;
		}
		System.out.println(cnt);
	}
}
