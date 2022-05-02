package step07;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ_11654 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		br.close();
				
		System.out.println((int) str.charAt(0));
	}
}
