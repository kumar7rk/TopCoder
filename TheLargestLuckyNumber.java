package TopCoder;

public class TheLargestLuckyNumber{
	public static void main(String[]args){
		int n = 100;
		int res = find(n);
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

}