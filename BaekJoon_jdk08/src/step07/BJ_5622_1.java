package step07;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 76ms
public class BJ_5622_1 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		br.close();

		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			int n = 1;
			switch (str.charAt(i)) {
				case 'A': case 'B': case 'C': n = 2; break;
				case 'D': case 'E': case 'F': n = 3; break;
				case 'G': case 'H': case 'I': n = 4; break;
				case 'J': case 'K': case 'L': n = 5; break;
				case 'M': case 'N': case 'O': n = 6; break;
				case 'P': case 'Q': case 'R': case 'S': n = 7; break;
				case 'T': case 'U': case 'V': n = 8; break;
				case 'W': case 'X': case 'Y': case 'Z': n = 9; break;
				default: n = 0; break;
			}

			sum += n + 1;
		}

		System.out.println(sum);
	}
}
