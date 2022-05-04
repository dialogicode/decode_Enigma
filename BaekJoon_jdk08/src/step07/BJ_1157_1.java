package step07;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 204ms
public class BJ_1157_1 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		br.close();
		
		str = str.toUpperCase();

		int[] alphabet = new int[26];
		for (int i = 0; i < str.length(); i++) {
			int n = str.charAt(i) - 'A';
			alphabet[n]++;
		}

		int max = -1;
		for (int i : alphabet) { if (i > max) max = i; }

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < alphabet.length; i++) {
			if (alphabet[i] == max) sb.append((char)('A' + i));
		}

		if (sb.toString().length() == 1) System.out.println(sb.toString());
		else System.out.println("?");
	}
}
