package step03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ_2741 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < n; i++) {
			sb.append(i).append("\n");
		}
		sb.append(n);

		System.out.println(sb.toString());
	}
}
