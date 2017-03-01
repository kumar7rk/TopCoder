package topCoderV1dot1;

public class RelationClassifier {

	public static void main(String[] args) {
		int[] domain = {35, 25, 24, 49, 7, 48, 37, 44}
		; 
		int[] range =  	
			{38, 18, 5, 1, 45, 48, 9, 41};
		System.out.println(isBijection(domain, range));
	}

	private static String isBijection(int[] domain, int[] range) {
		for (int i = 0; i < domain.length; i++) {
			for (int j = i+1; j < domain.length; j++) {
				if (domain[i] ==  domain[j] || range[i] == range[j]) {
					return "Not";
				}
			}
		}
		return "Bijection";
	}

}
