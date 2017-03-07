package TopCoder;

import org.apache.commons.lang3.StringUtils;

public class InterestingNumber {

	public static void main(String[] args) {
		String x = 
				"20020000"
				;
		String res = isInteresting(x);
		System.out.println(res);

	}
	public static String isInteresting(String x){

		boolean []checked = new boolean[10];
//		System.out.println(checked[0]);
		int count = counter(x);
		if (count==0) {
			return "Not Interesting";
		}
		char c = '2';
		int index = -1;
		for (int i = 0; i < x.length(); i++) {
			
			c = x.charAt(i);
			index = x.indexOf(c,i+1);
			int num = c-'0';
			if (!checked[num]){
//				System.out.println(i);
				checked[num] = true;
//				checked[index] = true;
				
				System.out.println("index-1-i -->" +"" + (index -1-i));
				System.out.println(index + "     1 " + i + "    " +c);
				if ((index -1-i) != (num)) {
					return "Not Interesting";
				}
				
			}
		}		
		return "Interesting";
	}
	public static int counter(String x) {
		Integer []count = new Integer[10]; 
		for (int i = 0; i < 10; i++) {
			count[i] = StringUtils.countMatches(x, i+"");
		}
		for (Integer integer : count) {
//			System.out.println(integer);
			if (integer!=2 || integer!=0) {
				return 0;
			}
		}
		return 1; 
	}
}