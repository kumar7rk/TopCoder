package TopCoder;
public class TCPhoneHomeEasy{
	public static void main(String[] args){
		int digits = 7;
		String[] specialPrefixes = { "0", "1", "911" };
		int res = validNumbers(digits,specialPrefixes);
		System.out.println(res);
	}
	public static int validNumbers(int digits,String[] specialPrefixes){
		int p = (int)Math.pow(10,digits);
		for(String s : specialPrefixes)
			p-= Math.pow(10, (digits-s.length()));
		
		return p;

	}
}