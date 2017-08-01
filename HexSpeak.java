package TopCoder;
public class HexSpeak {
	public String decode(long cipherText){
		String hex = Long.toHexString(cipherText);
		for (int i = 2; i < 10; i++) 
			if (hex.contains(i+"")) return "Error!";
		hex = hex.replaceAll("1", "I");
		hex = hex.replaceAll("0", "O");
		
		return hex.toUpperCase();
	}
}
