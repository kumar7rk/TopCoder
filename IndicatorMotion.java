package TopCoder;

public class IndicatorMotion {

	public static void main(String[] args) {
		String program = "F10R01F10";
		char startState = '/';
		String res = getMotion(program,startState);
		System.out.println(res);
	}

	public static String getMotion(String program, char startState) {
		String res = startState+"";
		for (int i = 0; i < program.length(); i= i+3) {
			char c = program.charAt(i);
			int val = Integer.parseInt(program.substring(i+1,i+3));
			for (int j = 0; j < val; j++) {
				switch (c) {
				case 'L':
					if (startState=='|') {
						startState = '\\';
						res = res.concat(startState+"");
						break;
					}
					if (startState=='\\') {
						startState = '-';
						res = res.concat(startState+"");
						break;
					}
					if (startState=='-') {
						startState = '/';
						res = res.concat(startState+"");
						break;
					}
					if (startState=='/') {
						startState = '|';
						res = res.concat(startState+"");
						break;
					}
					break;
				case 'R':
					if (startState=='\\') {
						startState = '|';
						res = res.concat(startState+"");
						break;
					}
					if (startState=='|') {
						startState = '/';
						res = res.concat(startState+"");
						break;
					}
					if (startState=='/') {
						startState = '-';
						res = res.concat(startState+"");
						break;
					}
					if (startState=='-') {
						startState = '\\';
						res = res.concat(startState+"");
					}
					break;
				case 'S':
						res = res.concat(startState+"");
					break;
				case 'F':
					if (startState=='\\') {
						startState = '/';
						res = res.concat(startState+"");
						break;
					}
					if (startState=='/') {
						startState = '\\';
						res = res.concat(startState+"");
						break;
					}
					if (startState=='-') {
						startState = '|';
						res = res.concat(startState+"");
						break;
					}
					if (startState=='|') {
						startState = '-';
						res = res.concat(startState+"");
						break;
					}
					break;
	
				default:
					break;
				}
			}
		}
		return res;
	}
}