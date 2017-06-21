package TopCoder;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CorruptedMessage {

	public static void main(String[] args) {
		//xksyvkfsxikhdjdfmqlsmvdijobopdqgnvpqugka
		String s = "abc";
//		System.out.println(s.length());
		int k = 3;
		String result = reconstructMessage(s,k);
		System.out.println(result);
	}

	public static String reconstructMessage(String s, int k) {
		String result = "";
		int[] used = new int[256];
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			used[c]++;
		}
		char c = 'a';
		for (int i = 'a'; i <='z'; i++) {
			if (used[i]+k==s.length()) {
				for (int j = 0; j < s.length(); j++) {
					result+=(char)i+"";
				}
				return result;
			}
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
