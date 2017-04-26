package TopCoder;

public class BearSong {

	public static void main(String[] args) {
		int[] notes = {9,10,7,8,9};
		int res = countRareNotes(notes);
		System.out.println(res);
		

	}

	public static int countRareNotes(int[] notes) {
		int[]count = new int [1001];
		int res = 0;
		for (int i : notes) count[i]++;
		for (int i : count) 
			if (i==1)
				res++;
		return res;
	}

}
