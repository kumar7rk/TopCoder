package TopCoder;

public class CultureShock {

	public static void main(String[] args) {
		String text = "ZEE ZEE ZED ZEDS ZEE ZEES";
		String res = translate(text);
		System.out.println(res);
	}
	public static String translate(String text){
		String res = "";
		String []t = text.split(" ");
		for (String s : t) {
			if (s.equals("ZEE")) res = res.concat("ZED");
			
			else
				res = res.concat(s);
			res = res.concat(" ");
		}
		return res.trim();
		
	}
}
