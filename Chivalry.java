package TopCoder;

public class Chivalry {

	public static void main(String[] args) {
		String first = "MM";
		String second = "MW";
		String res = getOrder(first,second);
		System.out.println(res);
	}

	public static String getOrder(String first, String second) {
		String res = "";
		int n = first.length();
		int m = second.length();
		int count1 = 0;
		int count2 = 0;
		while (n>count1&&m>count2) {
			char c1 = first.charAt(count1);
			char c2 = second.charAt(count2);
			if (c1=='M'&&c2=='W') {
				res+=c2;
				count2++;
			}
			else {
				res+=c1;
				count1++;
			}
		}
		
		if (count1<n) res+=first.substring(count1);
		else res+=second.substring(count2);
		return res;
	}

}
