package step06;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ_2577 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
		br.close();

		int[] list = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

		while(true){
			int a = num % 10;
			list[a]++;

			num /= 10;
			if (num == 0) break;
		}

		StringBuilder sb = new StringBuilder();
		for (int i : list) {
			sb.append(i).append("\n");
		}
		System.out.println(sb.toString());
	}
}
