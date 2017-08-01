package TopCoder;

public class WritingWords{
	public static void main(String[]args){
		String word = "CFIRJCDDSOZOYVEGURFWCSFMOXEQMRJOWRGHWLKOBMEAHKGCCN";
		int res = write(word);
		System.out.println(res);
	}
	public static int write(String word){
		int sum = 0;
		for(int i = 0; i < word.length();i++){
			char c = word.charAt(i);
			int value = (int) c-'A'+1;
			sum += value;
		}
		return sum;
	}
}