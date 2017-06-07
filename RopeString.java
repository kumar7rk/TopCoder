package TopCoder;

import java.util.ArrayList;
import java.util.Collections;

public class Ropestring {

	public static void main(String[] args) {

		String s = "--..-.---..--..-----.--.";
		String res = makerope(s);
		System.out.println(res);
	}

	public static String makerope(String s) {

		ArrayList<Integer> arrayList = new ArrayList<>();
		ArrayList<Integer> even = new ArrayList<>();
		int count = 0;
		int total_dots = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c=='.') {
				total_dots++;
				if (count>0) {
					if (count%2==0) even.add(count);
					
					else arrayList.add(count);
					
					count = 0;
				}
			}
			
			if (c=='-') count++;
			if (i==s.length()-1 && c == '-'){
				if (count %2==0) {
					even.add(count);
				}
				else arrayList.add(count);
			}
		}
		String res = "";
		
		Collections.sort(even);
		Collections.sort(arrayList);
		for (int i = even.size()-1; i >=0 ; i--) {
			for (int j = 0; j < even.get(i); j++) {
				res = res.concat("-");
			}
			if (total_dots==0) return res;
			res = res.concat(".");
			total_dots--;
		}
		for (int i = arrayList.size()-1; i >=0 ; i--) {
			for (int j = 0; j < arrayList.get(i); j++) {
				res = res.concat("-");
			}
			if (total_dots==0) return res;
			res = res.concat(".");
			total_dots--; 
		}
		for (int i = 0; i < total_dots; i++) {
			res = res.concat(".");
		}
		return res;
	}
}
