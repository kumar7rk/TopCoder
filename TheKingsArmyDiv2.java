package TopCoder;

public class TheKingsArmyDiv2 {
	public static void main(String[] args) {
		String[]state = {"SSSSS", "SSSSS", "SSSSH"}	;
		int result = getNumber(state);
		System.out.println(result);
	}

	public static int getNumber(String[] state) {
		int sL = state.length;
		int siL = state[0].length(); 
		for (int i = 0; i < sL; i++)
			for (int j = 0; j < siL-1; j++)
				if (state[i].charAt(j)=='H'&&state[i].charAt(j+1)=='H') return 0;
		for (int i = 0; i < state.length-1; i++) 
			for (int j = 0; j < state[i].length(); j++) 
				if (state[i].charAt(j)=='H'&&state[i+1].charAt(j)=='H') return 0;
		
		for (int i = 0; i < state.length; i++)
			for (int j = 0; j < state[i].length(); j++)
				if (state[i].charAt(j)=='H') return 1;
		
		return 2;
	}
}
