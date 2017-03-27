package TopCoder;

public class WaiterTipping {

	public static void main(String[] args) {
		int total = 4866;
		int taxPecent = 19;
		int money = 13398;

		int res = maxPercent(total, taxPecent, money);
		System.out.println(res);
	}

	public static int maxPercent(int total, int taxPecent, int money) {
		int bill_and_taxes = 0;
		bill_and_taxes = (int)(total + (taxPecent*total/100));
		long res = (long) Math.ceil((long)(money-bill_and_taxes)*100/total);
		return (int)res;
	}
}
