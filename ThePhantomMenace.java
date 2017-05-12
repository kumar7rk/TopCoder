package TopCoder;

public class ThePhantomMenace {

	public static void main(String[] args) {
		int[] doors = 
				
//			{1,2,3,4}

			{2,3,5,7,11}
		;
		int[] droids = 
//			{5,6,7,8}
			{1,8,13}
		;
		int res = find(doors,droids);
		System.out.println(res);
	}

	public static int find(int[] doors, int[] droids) {
		
		int max = Integer.MIN_VALUE;
		for (int a : doors) {
			int min_inner = Integer.MAX_VALUE;
			for (int b : droids) {
				int diff = Math.abs(a-b); 
				min_inner = min_inner>diff?diff :min_inner;
			}
			max = max<min_inner?min_inner:max;
		}
		return max;
	}

}
