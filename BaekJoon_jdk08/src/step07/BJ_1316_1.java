package step07;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 84ms
public class BJ_1316_1 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int cnt = 0;
		for (int i = 0; i < n; i++) {
			if (isGroupWord(br.readLine())) cnt++;
		}
		
		br.close();
		System.out.println(cnt);
	}

	public static boolean isGroupWord(String str){
		int n = str.length();
		boolean[][] arr = new boolean[26][n+2];
		
		for (int i = 0; i < n; i++) {
			arr[str.charAt(i) - 'a'][i+1] = true;
		}
		
		for (int i = 0; i < arr.length; i++) {
			if ((stateChange(arr[i]) != 0 && stateChange(arr[i]) != 2)) return false;
		}

		return true;
	}

	public static int stateChange(boolean[] list){
		int cnt = 0;

		for (int i = 0; i < list.length - 1; i++) {
			if(list[i] != list[i+1]) cnt++;
		}

		return cnt;
	}
}
