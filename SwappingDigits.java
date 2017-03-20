package TopCoder;

import icsV1dot1.Time;

public class SwappingDigits {

	public static void main(String[] args) {
		Time.startTime();
		String num = "1111111111111111111111111551121583579914617455348"; 
		String res = minNumber(num);
		System.out.println(res);
		Time.endTime();
	}
	public static String minNumber(String num){
		StringBuffer sb = new StringBuffer(num);
		int index = -1;
		for (int i = 0; i < num.length(); i++) {
			char min_char = '9';
			for (int j = i; j < num.length(); j++) {
				char c1 = num.charAt(j);
				if (i==0 && c1 =='0') c1 = 'Z';
				if (c1<=min_char) {
					min_char = c1;
					index = j;
				}
			}
			if (index == i ||num.charAt(i) == min_char) {
				continue;
			}
			char replace = num.charAt(i);
			sb.setCharAt(i, min_char);
			sb.setCharAt(index, replace);
			break;
		}
		return sb.toString();
	}
	 public static String minNumber1(String nu) { 
	      String r = nu; 
	      int n = nu.length(); 
	      for(int i = 0; i < n; ++i)  
	         for(int j = i + 1; j < n; ++j) { 
	            char[] c = nu.toCharArray();  
	            if(c[j] == '0' && i == 0) continue; 
	            char t = c[i]; 
	            c[i] = c[j]; 
	            c[j] = t; 
	            if(new String(c).compareTo(r) < 0) 
	               r = new String(c); 
	         }
	      return r; 
	   } 
}
