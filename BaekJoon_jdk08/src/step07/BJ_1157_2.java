package step07;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 168ms
public class BJ_1157_2 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		br.close();
		
		int[] alphabet = new int[26];
		for (int i = 0; i < str.length(); i++) {
			int n = 0;
			char c = str.charAt(i);
			if ('a' <= c && c <= 'z'){
				n = c - 'a';
			} else if ('A' <= c && c <= 'Z'){
				n = c - 'A';
			}
			alphabet[n]++;
		}

		int max = -1;
		String result = null;
		for (int i = 0; i < alphabet.length; i++) {
			if (alphabet[i] > max) {
				max = alphabet[i];
				result = Character.toString((char) ('A' + i));
			} else if (alphabet[i] == max){
				result = "?";
			}
		}

		System.out.println(result);
	}
}
