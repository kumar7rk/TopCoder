package TopCoder;

import java.util.Arrays;

public class SequenceOfNumbers {

	public static void main(String[] args) {
		String[] sequence = 
			{"183","2","357","38","446","46","628","734","741","838"}
		;
		String res[] = rearrange(sequence);
		for (String s : res) System.out.print(s +" ");
	}

	public static String[] rearrange(String[] sequence) {
		int []sequence2 = new int[sequence.length]; 
		String res[] = new String[sequence.length];

		for (int i = 0; i < sequence2.length; i++) sequence2[i] = Integer.parseInt(sequence[i]);
		
		Arrays.sort(sequence2);
		
		for (int i = 0; i < res.length; i++) res[i] = sequence2[i]+"";
		
		return res;
	}

}
