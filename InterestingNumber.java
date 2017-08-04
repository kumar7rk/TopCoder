package TopCoder;

public class InterestingNumber {
	
	 public static void main(String[] args) {
		String x = "1001";
		String res = isInteresting(x);
		System.out.println(res);
	}
	public static String isInteresting(String x){
		boolean []checked = new boolean[10];
		if (counter(x)==0) return "Not interesting";
		char c = '2';
		int index = -1;
		for (int i = 0; i < x.length(); i++) {
			c = x.charAt(i);
			index = x.indexOf(c,i+1);
			int num = c-'0';
			if (!checked[num]){
				checked[num] = true;
				if ((index -1-i) != (num)) return "Not interesting";
			}
		}		
		return "Interesting";
	}
	public static int counter(String x) {
		int []count = new int[10]; 
		for (int i = 0; i < x.length(); i++) count[x.charAt(i)-'0']++;
		for (int counter : count) 
			if (counter != 0 && counter != 2) return 0;
		return 1; 
	}
}