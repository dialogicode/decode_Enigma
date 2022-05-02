package step07;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 84ms
public class BJ_11720_1 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		br.close();

		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += Integer.parseInt(Character.toString(str.charAt(i)));
		}

		System.out.println(sum);
	}
}
