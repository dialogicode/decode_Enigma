package step06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1546 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		br.close();

		int maxScore = 0;
		double result = 0;

		for (int i = 0; i < n; i++) {
			int score = Integer.parseInt(st.nextToken());
			result += score;
			if (score > maxScore) maxScore = score;
		}

		result = result * 100 / (double)maxScore;
		result /= n;

		System.out.println(result);
	}
}
