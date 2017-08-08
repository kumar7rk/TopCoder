package TopCoder;

public class WaiterTipping {
	public static void main(String[] args) {
		int total = 226;
		int taxPecent = 48;
		int money = 584;
		int res = maxPercent(total, taxPecent, money);
		System.out.println(res);
	}

	public static int maxPercent(int total, int taxPecent, int money) {
		int max = -1;
		for (int i = 0; i <money; i++) {
			double tot = total + (taxPecent*total/100) + Math.floor(total*i/100);
			if (tot<=money) max = max<i?i:max;
			if (tot>=money) return max;
		}
		return -1;
	}
}
