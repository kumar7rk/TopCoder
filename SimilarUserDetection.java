package TopCoder;

public class SimilarUserDetection {

	public static void main(String[] args) {
		String[] handles = {"top", "coder", "TOPCODER", "TOPC0DER"};
		String res = haveSimilar(handles);
		System.out.println(res);
	}
	public static String haveSimilar(String[] handles) {
		for (int i = 0; i < handles.length; i++) {
			for (int j = i+1; j < handles.length; j++) {
				String s1 = handles[i];
				String s2 = handles[j];
				if (s1.equals(s2)) return "Similar handles found";
				
				s1 = s1.replaceAll("0", "O").replaceAll("1", "I").replaceAll("l", "I");
				s2 = s2.replaceAll("0", "O").replaceAll("1", "I").replaceAll("l", "I");
				
				if (s1.equals(s2)) return "Similar handles found";
			}
		}
		return "Similar handles not found";
	}

}
