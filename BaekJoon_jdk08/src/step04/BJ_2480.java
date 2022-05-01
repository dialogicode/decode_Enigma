package step04;

import java.util.Scanner;

public class BJ_2480 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] dice = { sc.nextInt(), sc.nextInt(), sc.nextInt() };
		sc.close();

		int max = 0;
		int reward = 0;

		if (dice[0] == dice[1] && dice[1] == dice[2] && dice[2] == dice[0]) {
			reward = 10000 + dice[0] * 1000;
		} else if (dice[0] != dice[1] && dice[1] != dice[2] && dice[2] != dice[0]) {
			for (int num : dice) { if (num > max) max = num; }
			reward = max * 100;
		} else {
			if (dice[0] == dice[1]) reward = 1000 + dice[0] * 100;
			else if (dice[1] == dice[2]) reward = 1000 + dice[1] * 100;
			else if (dice[2] == dice[0]) reward = 1000 + dice[2] * 100;
		}

		System.out.println(reward);
	}
}
