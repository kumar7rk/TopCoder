package TopCoder;

public class ExplodingRobots {

	public static void main(String[] args) {
		int x1 = 10;
		int x2 = 5;
		int y1 = -9;
		int y2 = -10;
		String instructions = "LULULULLLUULRULULULULULULLULULLULD";
		String res = canExplode(x1, y1, x2, y2, instructions);
		System.out.println(res);
		

	}

	public static String canExplode(int x1, int y1, int x2, int y2, String instructions) {
		int U = 0;
		int D = 0;
		int L = 0;
		int R = 0;
		
		for (char c : instructions.toCharArray()) {
			if (c=='U') U++;
			if (c=='D') D++;
			if (c=='L') L++;
			if (c=='R') R++;
		}
		if(Math.abs(x2-x1)<=L+R &&Math.abs(y2-y1)<=U+D) return "Explosion";
		return "Safe";
	}

}
