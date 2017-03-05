package TopCoder;

public class PriorityQueue {

	public static void main(String[] args) {
		String s = "ebebbebbbeeeebbeeebebbbbbeebbebbbeebbbebbbeebbebebebeebebbeeebbeeeebbbeeebb";
		int[] a = {219, 85, 927, 420, 314, 582, 307, 897, 597, 384, 369, 819, 682, 986, 50, 593, 297, 738, 102, 189, 152, 659, 22, 38, 449, 971, 641, 412, 366, 500, 342, 888, 571, 555, 358, 855, 186, 956, 797, 483, 320, 472, 254, 373, 57, 102, 681, 860, 239, 405, 748, 560, 796, 690, 529, 731, 115, 594, 761, 198, 63, 146, 988, 610, 351, 534, 714, 790, 393, 531, 981, 284, 144, 807, 831};
		
		int result = findAnnoyance(s,a);
		System.out.println(/*"="+*/result);
		
	}

	static int findAnnoyance(String s, int[] a) {
		int result = 0;
		for (int i = 1; i < a.length; i++) {
			String newString = s.substring(i);
			for (char c : newString.toCharArray()) {
				if (c=='b') {
					result+=a[i-1];
				}
			}
			}
		return result;
	}

}
