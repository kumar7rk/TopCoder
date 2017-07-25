package TopCoder;

import icsV1dot1.Time;

public class TheLargestLuckyNumber{
	public static void main(String[]args){
		int n = 100;
		Time.startTime();
		int res = find1(n);
		Time.endTime();
		System.out.println(res);
	}
	public static int find(int n){
		for(int i = n;i>0;i--){
			String s = i+"";
			s = s.replace("4", "");
			s = s.replace("7", "");
			if (s.equals("")) return i;
		}
		return n;
	}
	public static int find1(int n) {
	    for (int i = n; i >= 0; --i) {
	      boolean ok = true;
	      int k = i;
	      while (k > 0) {
	        if (k%10 != 4 && k%10 != 7) {
	          ok = false;
	          break;
	        }
	        k /= 10;
	      }
	      if (ok) return i;
	    }
	    return -1;
	  }

}