package TopCoder;

import java.util.HashMap;
import java.util.Map.Entry;

public class LiveConcert {

	public static void main(String[] args) {

		int[]h = 
			{10, 9, 8, 7}
		;
		String[]s =
			{"a", "b", "c", "d"}		
		;
		int result = maxHappiness(h,s);
		System.out.println(result);
	}

	public static int maxHappiness(int[] h, String[] s) {
		int hapiness = 0;
		HashMap<String, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < s.length; i++) {
			if (hashMap.containsKey(s[i])) h[i] = hashMap.get(s[i])<h[i] ? h[i] : hashMap.get(s[i]) ;
			hashMap.put(s[i], h[i]);
		}
		for (Entry<String, Integer> entry : hashMap.entrySet()) hapiness+=entry.getValue();
		return hapiness;
	}
}