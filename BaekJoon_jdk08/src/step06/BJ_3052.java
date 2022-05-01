package step06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class BJ_3052 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < 10; i++) { set.add(Integer.parseInt(br.readLine()) % 42); }
		br.close();
		System.out.println(set.size());
	}
}
