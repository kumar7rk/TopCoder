package topCoderV1dot1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ParenthesesDiv2Medium {

	public static void main(String[] args) {
//		String s = ")))))(((((";
		String s = ")((((()(()((";
		int[] i = correct1(s);
		System.out.print("{");
		for (int j : i) {
			System.out.print(j+" ");
		}
		System.out.print("}");
		
	}
	public static int[] correct(String s) {
		ArrayList<Integer> list = new ArrayList<>();
		int d = 0;
		int N = s.length();
		char[]c = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			if (c[i]=='(') {
				if (d>=N-i-1) {
					list.add(i);
					d--;
				}
				else d++;
			}
			else {
				if (d==0) {
					list.add(i);
					d++;
				}
				else d--;
			}	
		}
		int[] sequence = new int[list.size()];
		Iterator<Integer> iterable = list.iterator();
		for (int i = 0; i < sequence.length; i++) {
			sequence[i] = iterable.next();
		}
		return sequence;
	}
	public static int[] correct1(String s) {
	        int n = s.length();
	 
	        final ArrayList<Integer> ans = new ArrayList<>();
	        int d = 0;
	        for (int i = 0; i < n; ++i) {
	            if (s.charAt(i) == '(') {
	                d++;
	            } else {
	                if (d == 0) {
	                    ans.add(i);
	                    d++;
	                } else {
	                    d--;
	                }
	            }
	        }
	 
	        d = 0;
	        for (int i = n - 1; i > 0; --i) {
	            if (s.charAt(i) == ')') {
	                d++;
	            } else {
	                if (d == 0) {
	                    ans.add(i);
	                    d++;
	                } else {
	                    d--;
	                }
	            }
	        }
	 
	        final int[] bans = new int[ans.size()];
	        for (int i = 0; i < ans.size(); i++) {
	            bans[i] = ans.get(i);
	        }
	 
	        return bans;
	    }
}

