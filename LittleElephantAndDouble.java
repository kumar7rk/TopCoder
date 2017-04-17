package TopCoder;

import java.util.Arrays;

public class LittleElephantAndDouble{
	public static void main(String[]args){
		int[] A = {148, 298, 1184};
		String res = getAnswer(A);
		System.out.println(res);
	}
	public static String getAnswer(int[]A){
		
		Arrays.sort(A);
		int max = A[A.length-1];
		int count = 0;
		for(int i = 0; i< A.length-1; i++){
			int current = A[i];
			System.out.println(current + " " + max);
			while(current <=max){
				if(current ==max){
					count++;
					break;
				 }
				current *=2;
			}
		}
		if(count==A.length-1) return "YES";
		return "NO";
	}
}