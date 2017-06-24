package TopCoder;

import java.util.ArrayList;
import java.util.Collections;

public class Plusonegame {

	public static void main(String[] args) {

		String s = "549";
		String res = getOrder(s);
		System.out.println(res);
	}

	public static String getOrder(String s) {
		int counter = 0;
		String res = "";
		int plus = 0;
		ArrayList<Integer> arrayList = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c=='+') counter++;
			else arrayList.add(Integer.parseInt(c+""));
		}
		Collections.sort(arrayList);
		
		for (int i = 0; i < arrayList.size(); i++) {
			int digit = arrayList.get(i);
			if (plus==counter || plus==digit) res = res.concat(digit+"");
			else if (plus<digit && plus<counter) {
				res = res.concat("+");
				res = res.concat(digit+"");
				plus++;
			}
		}
		for (int i = 0; i < (counter-plus); i++) {
			res = res.concat("+");
			
		}
//		for (Integer i : arrayList) System.out.print(i+ " ");
//		System.out.println("Counter: " + counter);
		return res;
	}
}