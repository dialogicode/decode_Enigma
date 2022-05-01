package step06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_4344 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;

		int n = Integer.parseInt(br.readLine());
 
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int m = Integer.parseInt(st.nextToken());
			int[] score = new int[m];
			
			for (int j = 0; j < m; j++) { score[j] = Integer.parseInt(st.nextToken()); }
			
			double average = 0;
			for (int j : score) { average += j; }
			average /= m;

			double cnt = 0;
			for (int j : score) { if (j > average) cnt++; }

			sb.append(String.format("%.3f%%\n", cnt * 100 / m));
		}

		System.out.println(sb.toString());
		br.close();
	}
}
