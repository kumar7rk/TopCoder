package TopCoder;

public class BettingStrategy {

	public static void main(String[] args) {

		int initSum = 15;
		String outcome = "LLLWLLLL";
		int res = finalSum(initSum, outcome);
		System.out.println(res);
	}

	public static int finalSum(int initSum, String outcome) {
		int bal = initSum;
		int bet = 1;
		for (int i = 0; i < outcome.length(); i++) {
			char c = outcome.charAt(i);
			if (bal>=bet) {
				
				if (c=='W'){
					bal +=bet;
					bet = 1;
				}
				else if (c=='L') {
					bal -= bet;
					bet = 2*bet;
				}
				
			}
			else return bal;
			
		}
		return bal;
	}

}
