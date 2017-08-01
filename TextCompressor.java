package TopCoder;

public class TextCompressor {
	public static void main(String [] args){
		String sourceText = "ABABA";
		String res = longestRepeat(sourceText);
		System.out.println(res);
	}
	public static String longestRepeat(String sourceText){
		int x = sourceText.length();
		int max = 0;
		String maxS = "";
		for(int i = 0;i<x-1;i++){
			for(int j = i+1;j<x;j++){
				String temp = sourceText.substring(i,j);
				if (overlapping(sourceText, temp)) {
					if (max < temp.length()) {
						max = temp.length();
						maxS = temp;
					}
				}
			}
		}
		return maxS;
	}
	// checks overlapping and if the substring exists twice
	public static boolean overlapping(String input, String temp){
		 int offset = 0, index = 0, indexTemp = 0;
		 index = input.indexOf(temp, offset);
		 offset = index + temp.length();
		 indexTemp = input.indexOf(temp, offset);
		 System.out.println(temp + " " +offset + " " + index + " " + indexTemp);
		 if (indexTemp!=-1) {
			return true;
		}
		return false;
	}
}