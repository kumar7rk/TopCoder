package TopCoder;

public class TextStatistics {
	public static void main(String[] args) {
		String text = "a,ab,b,bc,c";
		double average = averageLength(text);
		System.out.println(average);
	}
	public static double averageLength(String text){
		if (text.equals(null)) return 0.0;
		double avg = 0.0;
		int counter = 0;
		int wordsLength = 0;
		String word[] = text.split("\\P{Alpha}+");
		for (String w : word) {
			if (w.length()>0) {
				counter+=w.length();
				wordsLength++;
			}
		}
		if (word.length!=0) avg = (double) counter/wordsLength;
		return avg;
	}
}