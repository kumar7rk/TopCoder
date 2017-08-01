package TopCoder;

public class Pronunciation {

	public static void main(String[] args) {
		String []words = {"a", "Aa", "aaa", "AAaA", "AAAAA", "aAAaAA", "aaaaaaaaaaaaaaaaaaaaaaAA", "aaaaaaaaaaaaaaaaaarg", "AAAAAAAAAAAAAAaarggghh"};
		String res = canPronounce(words);
		System.out.println(res);
	}
	public static String canPronounce(String[] words){
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			int vowel = 0;
			int consonant = 0;
			for (int j = 0; j < word.length(); j++) {
				char c = word.charAt(j);
				if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u' || c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
					consonant = 0;
					vowel++;
					if (j>=1 && (word.charAt(j-1) == c || word.toLowerCase().charAt(j-1)==c || word.toUpperCase().charAt(j-1)==c)) vowel = 1;
				}
				else if (c!='a'||c!='e'||c!='i'||c!='o'||c!='u' || c!='A'||c!='E'||c!='I'||c!='O'||c!='U')  {
					vowel = 0;
					consonant++;
				}
				if (consonant ==3 ||vowel ==2) return word;
			}
		}
		return "";
	}
}