package TopCoder;

public class OptimalList {

	public static void main(String[] args) {
		String inst = "NENENNWWWWWS";
		String res = optimize(inst);
		System.out.println(res);

	}

	public static String optimize(String inst) {
		int x = 0;
		int y = 0;
		String res = "";
		for (int i = 0; i < inst.length(); i++) {
			char c = inst.charAt(i);
			if (c=='N') y++;
			if (c=='S') y--;
			if (c=='W') x--;
			if (c=='E') x++;
		}
//		System.out.println(x+ " " + y);
		if (x>0)
			for (int i = 0; i < x; i++) 
				res+="E";
		if (y>0) 
			for (int i = 0; i < y; i++)
				res+="N";
		
		if (y<0)
			for (int i = y; i <0; i++) 
				res+="S";
		if (x<0)
			for (int i = x; i <0; i++) 
				res+="W";
		
		return res;
	}
}
