package step03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ_2439 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n-i-1; j++) { sb.append(" "); }
			for (int j = 0; j < i+1; j++) { sb.append("*"); }
			sb.append("\n");
		}

		System.out.println(sb.toString());
	}
}
