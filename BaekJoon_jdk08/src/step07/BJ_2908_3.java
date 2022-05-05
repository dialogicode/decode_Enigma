package step07;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 76ms
public class BJ_2908_3 {
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		br.close();


		int[] arrInt = strToArrInt(str, " ");
		int a = reverseInt(arrInt[0]);
		int b = reverseInt(arrInt[1]);

		System.out.println((a > b) ? a : b);
	}

	public static int reverseInt(int a){
		int result = 0;
		int tmp = a;
		
		while (tmp != 0){
			result = result * 10 + tmp % 10;
			tmp /= 10;
		}

		return result;
	}

	public static int[] strToArrInt(String str, String dil){
		StringTokenizer st = new StringTokenizer(str, dil);
		int n = st.countTokens();
		int[] result = new int[n];
		for (int i = 0; i < n; i++) { result[i] = Integer.parseInt(st.nextToken()); }
		return result;
	}
}