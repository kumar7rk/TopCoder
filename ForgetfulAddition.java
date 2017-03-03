package TopCoder;

import icsV1dot1.Time;
import static java.lang.Math.*;
public class ForgetfulAddition {

	public static void main(String[] args) {
		Time.startTime();
		String expression = "67847587";
		int result = minNumber(expression);
		System.out.println(result);
		Time.endTime();
	}

	private static int minNumber(String expression) {
		int result = Integer.MAX_VALUE;
		for (int i = 0; i < expression.length()-1; i++) {
			String s1 = expression.substring(0,i+1);
			String s2 = expression.substring(i+1);
			Integer i1 = Integer.parseInt(s1);
			Integer i2 = Integer.parseInt(s2);
			int sum = i1+i2;
			if (sum<result) {
				result = sum;
			}
		}
		return result;
	}
	public static int minNumber1(String s) {
	    
	    int r = 999999;
	    for(int i=1;i<s.length();i++){
	      int t = Integer.parseInt(s.substring(0,i)) + Integer.parseInt(s.substring(i));
	      r = min(r,t);
	    }
	    return r;
	  }

}
