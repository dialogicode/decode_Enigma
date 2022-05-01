package step03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ_1110 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int init = Integer.parseInt(br.readLine());
		br.close();

		int cnt = 0;
		int tmp = init;
		
		while(true){
			int a = tmp / 10;
			int b = tmp % 10;
			int c = (a + b) % 10;
			tmp = b * 10 + c;
			cnt++;
			
			if (tmp == init) break;
		}

		System.out.println(cnt);
	}
}
