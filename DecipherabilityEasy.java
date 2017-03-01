package topCoderV1dot1;

import icsV1dot1.Time;

public class DecipherabilityEasy {

	public static void main(String[] args) {

		Time.startTime();
		String s = "aabccccbabaabacaab";
		String t = "aabccccbabaaacaab";
		String result = check1(s,t);
		System.out.println(result);
		Time.endTime();
	}

	private static String check(String s, String t) {
		int counter = 0;
		if (s.length()-1!=t.length()) return "Impossible";
		int i = 0;
		int j = 0;
		boolean bool = true;
		while (bool && i<s.length()) {
			char c1 = s.charAt(i);
			char c2 = t.charAt(j);
			if(counter == 2){
				bool = false;
				return "Impossible";
			}
			if (c1!=c2) {
				counter++;
				i++;
			}
			else if (c1==c2) {
				i++;
				j++;
			}
			
		}
		return "Possible";	
	}
	public static String check1(String s, String t) {
	    
	    String r = "Possible", n = "Impossible";
	    for(int i=0;i<s.length();i++){
	      String x = s.substring(0,i) + s.substring(i+1);
	      if(x.equals(t)) return r;
	    }
	    return n;
	  }
}
