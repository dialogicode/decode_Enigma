package step07;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ_2941 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = br.readLine()
			.replaceAll("c=", "0")
			.replaceAll("c-", "0")
			.replaceAll("dz=", "0")
			.replaceAll("d-", "0")
			.replaceAll("lj", "0")
			.replaceAll("nj", "0")
			.replaceAll("s=", "0")
			.replaceAll("z=", "0")
			.length();

		br.close();
		System.out.println(n);
	}
}
