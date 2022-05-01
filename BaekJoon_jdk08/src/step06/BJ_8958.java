package step06;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ_8958 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < n; i++) {
			int sum = 0;
			String[] line = br.readLine().split("X");

			for (int j = 0; j < line.length; j++) {
				int num = line[j].length();
				sum += (num + 1) * num / 2;
			}

			sb.append(sum).append("\n");
		}

		br.close();
		System.out.println(sb.toString());
	}
}
