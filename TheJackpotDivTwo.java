package TopCoder;

import java.util.Arrays;

public class TheJackpotDivTwo {

	public static void main(String[] args) {
		int[] money = {21, 85, 6, 54, 70, 100, 91, 60, 71};
		int jackpot = 15;
		int[] res = find(money,jackpot);
		for (int i : res) System.out.println(i);
	}

	public static int[] find(int[] money, int jackpot) {
		while (jackpot>0) {
			Arrays.sort(money);
			money[0]++;
			jackpot--;
		}
		Arrays.sort(money);
		return money;
	}

}
