package TopCoder;

public class Cyclemin {
		
	public static void main(String []args){
		String s = "aba";
		int k = 0;
		String res = bestmod(s, k);
		System.out.println(res);
	}
	public static String bestmod(String s, int k){
		String smallest = s;
		for (int i = 0; i < s.length(); i++) {
			int count = 0;
			String s1 = s.substring(i)+s.substring(0,i);
			for (int j = 0; j < s1.length();j++) {
				if (count==k) break;
				if (s1.charAt(j)!='a') {
					s1 = s1.replaceFirst(s1.charAt(j)+"", "a");
					count++;
				}
			}
			if (s1.compareTo(smallest)<0) smallest = s1;
		}
			return smallest;
	} 
}