//Div2L3 SRM 717
package TopCoder;

import java.math.BigInteger;

public class DerangementsDiv2 {

	public static void main(String[] args) {
		int n = 20;
		int m = 27;
		int res = count(n, m);
		System.out.println(res);
	}

	public static int count(int n, int m) {
		int s = n+m;
		BigInteger fact = BigInteger.valueOf(1);
	    for (int i = 1; i <=s; i++)
	        fact = fact.multiply(BigInteger.valueOf(i));
	 
	    BigInteger fact1 = BigInteger.valueOf(1);
	    BigInteger fact107 = BigInteger.valueOf(1000000007);
	    for (int i = 1; i <=m; i++)
	        fact1 = fact1.multiply(BigInteger.valueOf(i));
	 
		    System.out.println(fact+  " "+ fact1);
		    System.out.println(fact1.mod(fact107));
		 
		    //1000000007
		return 0;
	}

}
