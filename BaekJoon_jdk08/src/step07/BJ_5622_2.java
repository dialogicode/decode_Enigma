package step07;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 76ms - 메서드 분리
public class BJ_5622_2 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		br.close();

		int sum = 0;
		for (int i = 0; i < str.length(); i++) { sum += dialnum(str.charAt(i)) + 1; }

		System.out.println(sum);
	}

	public static int dialnum(char c){
		switch (c) {
			case 'A': case 'B': case 'C': return 2;
			case 'D': case 'E': case 'F': return 3;
			case 'G': case 'H': case 'I': return 4;
			case 'J': case 'K': case 'L': return 5;
			case 'M': case 'N': case 'O': return 6;
			case 'P': case 'Q': case 'R': case 'S': return 7;
			case 'T': case 'U': case 'V': return 8;
			case 'W': case 'X': case 'Y': case 'Z': return 9;
		}
		return 1;
	}
}
