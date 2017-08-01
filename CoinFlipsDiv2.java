package TopCoder;
public class CoinFlipsDiv2 {
	public static void main(String[] args) {
		String state = "THTTTTTTTTTTTTTHTTHTTTTTHHHTTTTHTTTTTTTTTT";
		int res = countCoins(state);
		System.out.println(res);
	}
	public static int countCoins(String state){
		int count = 0;
		if (state.charAt(0)!=state.charAt(1) || state.charAt(state.length()-2)!=state.charAt(state.length()-1)) count++;
		for (int i = 1; i < state.length()-1; i++) {
			char c_1 = state.charAt(i-1);
			char c1 = state.charAt(i);
			char c2 = state.charAt(i+1);
			if (c1!=c2 || c1!=c_1) count++;
		}
		return count;
	}
}
