package TopCoder;

public class TaxTable {

	public static void main(String[] args) {

		int taxAmount = 86304;
		int res = income(taxAmount);
		System.out.println(res);
	}
	public static int income(int taxAmount) {
		if (Math.round((taxAmount+6525)/0.25)>=100000L && Math.round((taxAmount+6525)/0.25)<117250L) return (int)Math.round((taxAmount+6525)/0.25);
		else if (Math.round((taxAmount+10042.50)/0.28)>=117250L && Math.round((taxAmount+10042.50)/0.28)<179650L) return (int)Math.round((taxAmount+10042.50)/0.28);
		else if (Math.round((taxAmount+18975)/0.33)>=178650L && Math.round((taxAmount+18975)/0.33)<319100L) return (int)Math.round((taxAmount+18975)/0.33);
		else if (Math.round((taxAmount+25357)/0.35)>=319100L) return (int)Math.round((taxAmount+25357)/0.35);
		return -1;
	}
}

/*public static int income(int taxAmount) {
		int[]range = new int[4];
		range[0] = (int)(100000*0.25)-6525;
		
		range[1] = (int)(117249*0.25)-6525;

		range[2] = (int) ((int)(178649*0.28)-10042.50);
		
		range[3] = (int)(319100*0.35)-25357;
//		for (int i : range) System.out.println(i);
		
		if (taxAmount<range[0]) return -1;
		else if (taxAmount>range[0]&&taxAmount<range[1]) return calculate(100000,117250, 0, taxAmount);
		else if (taxAmount>range[1]&&taxAmount<range[2]) return calculate(117250,178650, 1, taxAmount);
		else if (taxAmount>range[2]&&taxAmount<range[3]) return calculate(178650,319100, 2, taxAmount);
		else if (taxAmount>range[3]) return calculate(319100,Integer.MAX_VALUE, 3, taxAmount);
		return 0;
	}
	private static int calculate(int a, int b, int p, int taxAmount) {
//		System.out.println(a);
		double mul = 0;
		double sub = 0;
		if (p==0) {
			mul = 0.25;
			sub = 6525;
		}
		if (p==1) {
			mul = 0.28;
			sub = 10042.50;
		}
		if (p==2) {
			mul = 0.33;
			sub = 18975;
		}
		if (p==3) {
			mul = 0.35;
			sub = 25357;
		}
		int amount = 0;
		for (int i = b; i >=a; i--) {
			amount = (int) Math.round((i*mul)-sub);
			System.out.println((i*mul)-sub);
			if (amount==taxAmount) {
				return i;
			}
		}
		return 0;
	}*/