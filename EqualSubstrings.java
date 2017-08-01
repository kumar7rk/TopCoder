package TopCoder;

public class EqualSubstrings {
	public static void main(String[] args){
		String str = "fezfzeafcxpvoiuwxcvaazareeaaaaaaaaaaaaaaaaa";
		String res[] = new String[2]; 
		res = getSubstrings(str);
		System.out.println("{"+ res[0] + "," + res[1]+"}");
	}
	public static String[] getSubstrings(String str){
		String x = "";
		String y = "";
		String res[] = new String[2];
		for (int i = str.length(); i >= 0 ; i--) {
			x = str.substring(0,i);
			y =str.substring(i);
			boolean equal = count(x,y);
			if (equal) {
				res[0] = x;
				res[1] = y;
				return res; 
			}
		}
		return res;
	}
	public static boolean count(String x, String y){
		int counterX = 0;
		int counterY = 0;
		for (int i = 0; i < x.length(); i++) if (x.charAt(i)=='a') counterX++;
		for (int i = 0; i < y.length(); i++) if (y.charAt(i)=='b') counterY++;
		if (counterX == counterY) return true;
		return false;
	}
}