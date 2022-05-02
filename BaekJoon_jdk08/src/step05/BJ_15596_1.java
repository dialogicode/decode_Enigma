package step05;

// 24ms
public class BJ_15596_1 {
	long sum(int[] a) {
		long ans = 0;
		
		for (int i : a) {
			ans += i;
		}

		return ans;
	}
}
