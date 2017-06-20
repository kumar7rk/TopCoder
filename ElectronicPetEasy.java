package TopCoder;

public class ElectronicPetEasy {

	public static void main(String[] args) {
		int st1 = 719;
		int p1 = 754;
		int t1 = 140;
		int st2 = 424;
		int p2 = 280;
		int t2 = 997;
		String result = isDifficult(st1,p1,t1,st2,p2,t2);
		System.out.println(result);
	}

	private static String isDifficult(int st1, int p1, int t1, int st2, int p2, int t2) {
		int[] pet1 = new int[t1];
		int[] pet2 = new int[t2];
		pet1[0] = st1;
		for (int i = 1; i < t1; i++) pet1[i] = pet1[i-1]+p1;
		pet2[0] = st2;
		for (int i = 1; i < t2; i++) pet2[i] = pet2[i-1]+p2;
		for (int i = 0; i < pet1.length; i++) {
			for (int j = 0; j < pet2.length; j++) {
				if (pet1[i]== pet2[j]) {
					return "Difficult";
				}
			}
		}
		
		return "Easy";
	}
}
