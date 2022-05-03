package step07;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ_10809 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine().trim();
		br.close();

		int[] alphabet = new int[26];

		for (int i = 0; i < alphabet.length; i++) {
			alphabet[i] = -1;
		}
		
		for (int i = 0; i < input.length(); i++) {
			int a = input.charAt(i) - 'a';
			if(alphabet[a] == -1) alphabet[a] = i;
		}

		StringBuilder sb = new StringBuilder();
		for (int i : alphabet) { sb.append(i).append(" "); }

		System.out.println(sb.toString());
	}
}