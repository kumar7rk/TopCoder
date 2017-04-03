package TopCoder;

public class SwimmersDelight {

	public static void main(String[] args) {

		int[] x = 
			{1, 5}
		;
		int[] y = 
			{0, 10}		
		;
		int res = longestJump(x, y);
		System.out.println(res);
		
	}

	public static int longestJump(int[] x, int[] y) {
		
		int only1 = Math.max(x[0], 10-x[0]);
		int only2 = Math.max(x[1], 10-x[1]);
		double dist = Math.sqrt(Math.pow((x[1]-x[0]),2) +  Math.pow((y[1]-y[0]),2));;
		double a12 = Math.max(x[0], Math.max(dist, 10-x[1]));
		double a21 = Math.max(x[1], Math.max(dist, 10-x[0]));;
		
		double res = Math.min(only1, Math.min(only2, Math.min(a12, a21))); 		
		return (int) Math.round(res);
	}
}
/*
  int longest = x[0];
		double edxy = 0, ed2 = 0;
		int ed = 0;
		if (x[1] <= x[0]) return 10-x[0];
		edxy = Math.sqrt(Math.pow((x[1]-x[0]),2) +  Math.pow((y[1]-y[0]),2));
		System.out.println(Math.sqrt(Math.pow(8,2) +  Math.pow(10,2)));
		ed = (int) edxy;
		if (ed>10){
			int temp1 = 10-x[0]; 
			double temp2d = Math.sqrt(Math.pow((x[1]),2) +  Math.pow((y[1]),2));
			int temp2 = (int) temp2d;
			
			if (temp2<temp1) {
				longest = x[1];
				ed = temp2;
			}
			else ed = temp1;
		}
		longest = longest < ed ? ed : longest;
		return longest;
*/