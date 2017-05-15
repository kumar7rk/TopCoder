package TopCoder;

import java.util.ArrayList;

public class MarbleNecklace {

	public static void main(String[] args) {
		String necklace = "RGB";
		String res = normalize(necklace);
		System.out.println(res);
	}

	public static String normalize(String necklace) {
		StringBuffer buffer = new StringBuffer(necklace);
		buffer.reverse();
		String s = buffer.toString();
		int length = necklace.length();
		String res = necklace;
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add(necklace);
		for (int i = 0; i < length; i++) {
			String something = necklace.substring(i)+ necklace.substring(0,i);
			arrayList.add(something);
		}
		for (int i = 0; i < length; i++) {
			String something = s.substring(i)+ s.substring(0,i);
			arrayList.add(something);
		}

		for (String string : arrayList) {
			System.out.println(string);
			if (string.compareTo(res)<0) {
				res = string;
			}
		}
		return res;
	}
}
