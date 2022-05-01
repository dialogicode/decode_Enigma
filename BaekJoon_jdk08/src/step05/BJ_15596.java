package step05;

public class BJ_15596 {
	long sum(int[] a) {
		long ans = 0;
		// for (int i = 0; i < a.length; i++) { ans += a[i]; } // 28ms
		for (int i : a) { ans += i; } // 24ms
		return ans;
	}
}
