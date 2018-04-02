import java.util.*;
import java.math.*;

public class RingLex{
	public static void main(String[]args){
		String s = "abc";
	}
	public static String getmin(String s){
		int n = s.length();
		
		Set<String> set = new HashSet<>();
		
		// choosing offset - get the index of the smallest alphabet in t/s
						// - get the index of the second smallest alphabet in t/s
		for(int i = 0; i<n; i++){
			for (int j = 2; j<n; j++){
				if(isPrime(j)){
					String ns = "";
					
					for(int k = 0; k< n; k++)
						ns+= s.charAt((i+j*k) %n);
					
					set.add(ns);	
				}
			}
		}
		List<String> s1 = new ArrayList<>(set);
		Collections.sort(s1);
		if(s1.size()>0) return s1.get(0);
		
		return s;
	}
	
	
	public static boolean isPrime(int x) {
		if (x < 0)
			throw new IllegalArgumentException("Negative number");
		if (x == 0 || x == 1)
			return false;
		else if (x == 2)
			return true;
		else {
			if (x % 2 == 0)
				return false;
			for (int i = 3, end = (int)Math.sqrt(x); i <= end; i += 2) {
				if (x % i == 0)
					return false;
			}
			return true;
		}
	}
	
}
