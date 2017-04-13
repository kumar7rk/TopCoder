package TopCoder;
public class ElectionFraudDiv2{
	public static void main(String[]args){
		
		int[] percentages = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 8, 9, 7, 9, 3, 2, 3, 8};

		String res = IsFraudulent(percentages);
		System.out.println(res);
	}
	public static String IsFraudulent(int[] percentages){
		
		double lower = 0;
		double upper = 0;
		
		for (int i : percentages) {
			lower += i> 0 ? (i-0.5):0;
			upper += 0.49+i;
		}
		if (lower > 100 && upper < 100) return "YES";
		return "NO";
	}
}