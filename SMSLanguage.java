package TopCoder;

public class SMSLanguage {

	public static void main(String[] args) {

		String text = "What is the weather like today?";
		String res = translate(text);
		System.out.println(res);
	}
	public static String translate(String text){
		
		text = text.replaceAll("\\p{P}", "");
		text = text.toLowerCase();
		text = text.replaceAll("and", "&");
		text = text.replaceAll("ate", "8");
		text = text.replaceAll("at", "@");
		text = text.replaceAll("you", "U");
		return text;
	}

}
