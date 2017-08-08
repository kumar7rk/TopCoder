package TopCoder;

public class CoinFlipsDiv2 {
	public static void main(String[] args) {
		String state = "H";
		int res = countCoins(state);
		System.out.println(res);
	}
	public static int countCoins(String state){
		int count = 0;
		if (state.length()==1) return 0;
		for (int i = 0; i < state.length(); i++) {
			int i1 = i-1;
			int i2 = i+1;
			if (i==0) i1 = i2; 
			if (i==state.length()-1) i2=i1;
			if (state.charAt(i)!=state.charAt(i1) | state.charAt(i)!=state.charAt(i2)) count++;
		}
		return count;
		
	}
}
