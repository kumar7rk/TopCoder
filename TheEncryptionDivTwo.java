package TopCoder;

import java.util.HashMap;

public class TheEncryptionDivTwo {

	public static void main(String[] args) {
		String message = "topcoder";
		String res = encrypt(message);
		System.out.println(res);
	}
	public static String encrypt(String message) {
		String res = "";
		HashMap<Character, Character> hashMap = new HashMap<>();
		int count = 0;
		for (int i = 0; i < message.length(); i++) {
			char c = message.charAt(i);
			if (!hashMap.containsKey(c)) {
				char c1 = (char) ('a'+count++);
				hashMap.put(c, c1);
			}
		}
		for (int i = 0; i < message.length(); i++) 
			if (hashMap.containsKey(message.charAt(i))) 
				res = res.concat(hashMap.get(message.charAt(i))+"");
		return res;
	}
}