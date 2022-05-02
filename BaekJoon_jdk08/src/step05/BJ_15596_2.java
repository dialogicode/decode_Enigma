package step05;

// 28ms
public class BJ_15596_2 {
	long sum(int[] a) {
		long ans = 0;
		
		for (int i = 0; i < a.length; i++) {
			ans += a[i];
		}
		
		return ans;
	}
}
