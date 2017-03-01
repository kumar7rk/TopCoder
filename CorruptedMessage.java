package topCoderV1dot1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import icsV1dot1.Time;

public class CorruptedMessage {

	public static void main(String[] args) {
		String s = "xksyvkfsxikhdjdfmqlsmvdijobopdqgnvpqugka";
//		System.out.println(s.length());
		int k = 40;
		String result = reconstructMessage1(s,k);
		System.out.println(result);
	}

	private static String reconstructMessage(String s, int k) {

		HashMap<Character, Integer> hashMap = new HashMap<>();
		char c1[];
		c1 = s.toCharArray( );
		for(int i = 0; i<s.length(); i++){
			for(int j = 97;j <= 122;j++) 
				if(c1[i] == j){
				if (hashMap.containsKey(c1[i])) {
					int value = hashMap.get(c1[i]);
					hashMap.put(c1[i], ++value);
				}
				else {
					hashMap.put(c1[i], 1);
				}
			}
		}
		System.out.println(hashMap);
		String result = "";
		Character tempKey = 'a'; 
		int intKey = 1;
		Iterator entries = hashMap.entrySet().iterator();
		while (entries.hasNext()) {
		    Map.Entry entry = (Map.Entry) entries.next();
		    Character key = (Character)entry.getKey();
		    Integer value = (Integer)entry.getValue();
		    intKey = key+1;
		    tempKey = (char) intKey;
//		    System.out.println("Key = " + key + ", Value = " + value);
		    if (value+k==s.length()) {
		    	for (int i = 0; i < s.length(); i++) {
					result+=key+"";
				}
				return result;
			}
		}
		for (int i = 0; i < s.length(); i++) {
			result+=tempKey+"";
		}
		return result;
	}
	
	public static String reconstructMessage1(String s, int k) { 
	    int[] used = new int[256]; 
	    for (int i = 0; i < s.length(); i++) { 
	      char c = s.charAt(i); 
	      used[c]++; 
	    } 
	    char c = 'a'; 
	    for(int i = 'a'; i<='z'; i++) { 
	      if(used[i] == s.length() - k) { 
	        c = (char) i; 
	        return construct(s, c); 
	      } 
	      if(used[i] == 0) { 
	        c = (char)i; 
//	        System.out.println("Here:"+c);
	      } 
	    } 
	     
	    return construct(s, c); 
	  } 

	  private static String construct(String s, char c) { 
	    String res = ""; 
	    for (int j = 0; j < s.length(); j++) { 
	      res += (char)c; 
	    } 
	    return res; 
	  } 
}
