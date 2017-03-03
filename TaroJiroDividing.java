package TopCoder;

import java.util.ArrayList;
import java.util.TreeSet;

import icsV1dot1.Time;

public class TaroJiroDividing {

	public static void main(String[] args) {
		Time.startTime();
		int A = 9900032;
		int B = 39600128;
		int result = getNumber(A,B);
		System.out.println(result);
		Time.endTime();
	}

	private static int getNumber(int a, int b) {
		int result = 0;
		ArrayList<Integer> arrayListA = new ArrayList<>();
		ArrayList<Integer> arrayListB = new ArrayList<>();
		arrayListA.add(a);
		arrayListB.add(b);
		if (a%2!=0 || b%2!=0 || (a%b!=0 && a>b )|| (b%a!=0 && a<b)) return 0;
		while (a%2==0) {
			arrayListA.add(a/=2);
		}
		while (b%2==0) {
			arrayListB.add(b/=2);
		}
		if (arrayListA.size()<arrayListB.size()) {
			result = arrayListA.size();
		}
		else
			result = arrayListB.size();
		
		return result;
	}
	 public static int getNumber1(int A, int B){
		    TreeSet<Integer> ts1 = new TreeSet<>();
		    while(A%2== 0) {
		      ts1.add(A); A/= 2 ;
		    }
		    ts1.add(A);
		    int ans = 0 ;
		    while(B%2== 0) {
		      if(ts1.contains(B)) ans++  ; B/= 2 ;
		    }
		    if(ts1.contains(B)) ans++  ;
		    return ans;
		  }
}
