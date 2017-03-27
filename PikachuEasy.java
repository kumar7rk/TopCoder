package TopCoder;

public class PikachuEasy {

	public static void main(String[] args) {
		String word = "pikapi";
		String res = check(word);
		System.out.println(res);
	}
	public static String check(String word){
		String[] speak = {"pi","ka","chu"};
		String newWord = "";
		for (int i = 0; i < word.length(); i++) {
			if (word.contains(speak[0])) word = word.replaceFirst(speak[0], "XX");
			if (word.contains(speak[1])) word = word.replaceFirst(speak[1],"XX");
			if (word.contains(speak[2])) word = word.replaceFirst(speak[2], "XXX");
		}
		
		for (int i = 0; i < word.length(); i++) {
			newWord = newWord.concat("X");
		}
		if (!word.equals(newWord)) return "NO";
		
		return "YES";
	}
}
