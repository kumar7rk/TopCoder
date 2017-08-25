package TopCoder;

public class ColorfulRoad {

	public static void main(String[] args) {
		String road = "RBRBRBRBRBRBRBG";
		int res = getMin(road);
		System.out.println(res);
	}
	public static int getMin(String road) {

		int[]n = new int[105];
		for (int i = 0; i < n.length; i++) n[i] = Integer.MAX_VALUE;
		n[0] = 0;
		for (int i = 0; i < road.length(); i++) {
			for (int j = i+1; j < road.length(); j++) {
				if (road.charAt(i)=='R' && road.charAt(j)=='G')
					n[j] =(int) Math.min(n[j], n[i]+Math.pow((j-i), 2));
				if (road.charAt(i)=='G' && road.charAt(j)=='B')
					n[j] =(int) Math.min(n[j], n[i]+Math.pow((j-i), 2));
				if (road.charAt(i)=='B' && road.charAt(j)=='R')
					n[j] =(int) Math.min(n[j], n[i]+Math.pow((j-i), 2));
			}
		}
		if (n[road.length()-1]==Integer.MAX_VALUE) return -1;
		return n[road.length()-1];
	}
}
/*
 follow the sequence bases on the previous character present in the stack
 if stack empty || contains B add r
 if r add g
 if g add b
 need to make the note for the jump
 main challenge: when colors exist together how to make an account which one to count in one instance.
 


*/