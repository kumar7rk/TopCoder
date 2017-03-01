package topCoderV1dot1;

import icsV1dot1.Time;

public class AlternatingString {

	public static void main(String[] args) {

		Time.startTime();
		String s = "01010101010101010101010101010101010101010101010101";
		int result = maxLength(s);
		System.out.println(result);
		Time.endTime();
	}

	public static int maxLength(String s) {
		int counter = 1;
		int max = 1;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i+1; j < s.length();) {
				if (s.charAt(i)!=s.charAt(j)) {
					counter++;
					max = max<counter?counter:max;
					break;
				}
				else {
					counter = 1;
					break;
				}
			}
		}
		return max;
	}
	  public static int maxLength1(String s) {
	        int max = 1, curr = 1;
	        
	        for (int i = 1; i < s.length(); i++) {
	            
	            if (s.charAt(i) == s.charAt(i - 1))
	                curr = 1;
	            else
	                curr++;
	            
	            max = Math.max(max, curr);
	        }
	        
	        return max;
	    }
}
