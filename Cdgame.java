package topCoderV1dot1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import icsV1dot1.Time;

public class Cdgame {

	public static void main(String[] args) {
		Time.startTime();
		int[] a = 	
			{21, 17, 21, 18, 21, 17, 19, 18, 18, 20, 19, 18, 19};
		int[] b =
			{67, 70, 59, 62, 56, 55, 65, 73, 76, 68, 57, 80, 57}
		;
		int result = rescount(a,b);
		System.out.println(result);
		Time.endTime();
	}
	private static int rescount(int[] a, int[] b) {
		HashSet<Integer>hashSet = new HashSet<>();
		int[] olda = a;
		int[] oldb = b;
		olda = Arrays.copyOf(a, a.length);
		oldb = Arrays.copyOf(b, b.length);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				int suma = 0,sumb = 0;
				a = Arrays.copyOf(olda, a.length);
				b = Arrays.copyOf(oldb, b.length);
				
				int temp = olda[i];
				a[i] = oldb[j];
				b[j] = temp;
				
				for (int k = 0; k < oldb.length; k++) {
					suma+=a[k];
					sumb+=b[k];
				}
				
				int product = suma*sumb;
				hashSet.add(product);
			}
		}
		return hashSet.size();
	}
	//topcoder
	public static int rescount1(int[] a, int[] b) { 
	    int sumA = 0, sumB = 0; 
	    for (int i = 0; i < a.length; i++) { 
	      sumA += a[i]; 
	      sumB += b[i]; 
	    } 
	     
	    HashSet<Integer> res = new HashSet<Integer>(); 
	    for (int i : a) { 
	      for (int j : b) { 
	        res.add((sumA-i+j)*(sumB-j+i)); 
	      } 
	    } 
	    return res.size(); 
	  } 
}