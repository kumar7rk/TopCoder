package TopCoder;

public class FoxAndHandleEasy {

	public static void main(String[] args) {

		String S = "Ciel";
		String T = "CCieliel";
		String res = isPossible(S,T);
		System.out.println(res);
		
	}
	public static String isPossible(String S, String T){

		for (int i = 0; i < S.length(); i++) {
			String ST = S.substring(0,i)+S+S.substring(i);
			if (ST.equals(T)) return "Yes";
		}
		return "No";
		
	}

}
