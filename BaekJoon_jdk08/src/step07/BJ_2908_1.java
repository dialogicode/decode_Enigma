package step07;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// 80ms
public class BJ_2908_1 {
	
	public static void main(String[] args) throws Exception{
		Tool tool = new Tool();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		br.close();

		int[] arrInt = tool.parseStr(str, " ");
		int a = tool.reverseInt(arrInt[0]);
		int b = tool.reverseInt(arrInt[1]);

		System.out.println(tool.compareInt(a, b));
	}
}

class Tool{
	public int[] parseStr(String str, String dil){
		StringTokenizer st = new StringTokenizer(str, dil);
		int n = st.countTokens();

		int[] arrInt = new int[n];
			
		for (int i = 0; i < n; i++) {
			arrInt[i] = Integer.parseInt(st.nextToken());
		}
		return arrInt;
	}

	public int reverseInt(int a){
		int tmp = a;
		
		ArrayList<Integer> list = new ArrayList<>();
		
		while (true) {
			list.add(tmp % 10);
			tmp = tmp / 10;

			if (tmp == 0) break;
		}
		
		StringBuilder sb = new StringBuilder();
		for (Integer i : list) {
			sb.append(i);
		}
		
		return Integer.parseInt(sb.toString());
	}

	public int compareInt(int a, int b){
		int result = 0;

		if (a > b) result = a;
		else if (b > a) result = b;
		
		return result;
	}
}