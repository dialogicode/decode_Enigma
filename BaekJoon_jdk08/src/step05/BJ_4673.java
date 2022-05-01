package step05;

public class BJ_4673 {
	public static void main(String[] args) {
		int[] nums = new int[10000];
		for (int i = 0; i < 10000; i++) { nums[i] = i+1; }
		
		for (int i = 0; i < 10000; i++) {
			int result = d(i+1);
			if (result <= 10000) nums[result-1] = 0;
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 10000; i++) {
			if (nums[i] == 0) continue;
			sb.append(i+1).append("\n");
		}

		System.out.println(sb.toString());
	}

	public static int d(int n){
		int result = n;
		
		while (true){
			result += n % 10;
			n /= 10;
			if (n == 0) break;
		}

		return result;
	}
}
