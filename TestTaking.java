package TopCoder;

public class TestTaking{
	public static void main(String args[]){
		int questions = 5;
		int guessed = 5;
		int actual = 0;
		int res = findMax(questions, guessed, actual);
		System.out.println(res);
		
	}
	public static int findMax(int questions, int guessed, int actual){
		
		if (guessed>actual) return questions+actual-guessed;
		return questions-actual+guessed;
	}
	
}