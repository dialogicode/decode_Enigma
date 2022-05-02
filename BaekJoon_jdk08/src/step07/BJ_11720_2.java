package step07;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 76ms
public class BJ_11720_2 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] arr = br.readLine().split("");
		br.close();

		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += Integer.parseInt(arr[i]);
		}

		System.out.println(sum);
	}
}
