package step07;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_2675 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;

		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int m = Integer.parseInt(st.nextToken());
			String str = st.nextToken();
			
			for (int j = 0; j < str.length(); j++) {
				for (int k = 0; k < m; k++) {
					sb.append(str.charAt(j));
				}
			}

			sb.append("\n");
		}

		br.close();
		System.out.println(sb.toString());
	}
}
