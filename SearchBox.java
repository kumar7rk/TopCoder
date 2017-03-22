package TopCoder;

public class SearchBox{
	public static void main(String[]args){
		
		String text = "All in all youre just another brick in the wall";
		String search = "just";
		String wholeWord = "Y";
		int start = 17;
		int res = find(text, search, wholeWord, start);
		System.out.println(res);
	}
	public static int find(String text, String search, String wholeWord, int start){
		int counter = 0;
		if(wholeWord.equals("Y")){
			String word[] = text.split(" ");
			for(int i = 0; i< word.length; i++){
				if(search.equals(word[i]) && counter >= start) return counter;
				counter+=word[i].length();
				counter++;
			}
			return -1;
		}
		else{
			text = text.substring(start);
			if(text.contains(search))
				return start+text.indexOf(search);
		}
		return -1;
	}
}