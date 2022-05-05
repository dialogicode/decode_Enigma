package step07;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

// 236ms 스트림은 느렸다
public class BJ_2908_2 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		br.close();


		int[] arrInt = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
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
}
