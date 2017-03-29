package TopCoder;

public class RoboFactory {

	public static void main(String[] args) {

		int[] query = 
			{835, 681, 977, 455, 725, 71, 809, 559, 157, 603, 833, 905, 441, 375, 563, 885, 963, 81, 837, 797, 203}
		;
		String[] answer = 
			{"Odd", "Odd", "Odd", "Odd", "Odd", "Odd", "Odd", "Odd", "Odd", "Odd", "Odd", "Odd", "Odd", "Odd", "Odd", "Odd", "Odd", "Odd", "Odd", "Odd", "Odd"}			
		;
		int res = reveal(query, answer);
		System.out.println(res);
	}
	public static int reveal(int[] query, String[] answer){
		if (query.length==1) {
			if (query[0]%2==0 && answer[0].startsWith("E")) return -1;
			else return 0;
		}
		for (int i = 0; i < query.length; i++) {
			boolean num = query[i]%2 !=0;
			boolean stat = answer[i].startsWith("O");
			if ((num && !stat)|| (!num && stat)) return i;
		}
	for (int i = 0; i < answer.length-1; i++)
			if (answer[i].startsWith("E"))
			return -1;
		return 0;
	}

	
}
