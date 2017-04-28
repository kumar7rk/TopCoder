package TopCoder;

import icsV1dot1.Time;

public class LeftOrRight {

	public static void main(String[] args) {
		String program = "LL???RRRRRRR???";
		Time.startTime();
		int res = maxDistance1(program);
		Time.endTime();
		System.out.println(res);
	}

	public static int maxDistance(String program) {
		int length = program.length();
		int count1 = 0;
		int count2 = 0;
		int max1 = 0;
		int max2 = Integer.MIN_VALUE;
		for (int i = 0; i < length; i++) {
			String program1 = program.replace('?','L');
			if (!program1.contains("R")) return length;
			char c = program1.charAt(i);
			if (c == 'L') count1++;
			else count1--;
			max1 = count1 > max1 ? count1 : max1;
		}
		for (int i = 0; i < length; i++) {
			String program2 = program.replace('?','R');
			if (!program2.contains("L")) return length;
			char c = program2.charAt(i);
			if (c == 'R') count2++;
			else count2--;
			max2 = count2 > max2 ? count2 : max2;
		}
		return Math.max(max1, max2);
	}
	 public static int maxDistance1 (String program){
		 System.out.println(program);
	    int n = program.length();
	    int pos = 0, d = 0;
	    int ans = 0;
	    for(int i=0;i<n;i++){
	      
	    	if (program.charAt(i)=='L')
	        pos++;
	      
	    	if (program.charAt(i)=='R')
	        pos--;
	      
	    	if (program.charAt(i)=='?')
	        d++;
	        ans = Math.max(ans,Math.abs(pos)+d);
	        System.out.print(ans+ " " );
	      }
	    System.out.println();
	      return ans;
	  }
	  
}
