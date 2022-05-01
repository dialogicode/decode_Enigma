package step06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_10818 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int max = -1000000;
		int min = 1000000;
		
		for (int i = 0; i < n; i++) {
			int x = Integer.parseInt(st.nextToken());
			if (x > max) max = x;
			if (x < min) min = x;
		}
		br.close();

		System.out.printf("%d %d", min, max);
	}
}
