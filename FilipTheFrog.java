package TopCoder;

import java.util.Arrays;

public class FilipTheFrog {

	public static void main(String[] args) {
		int[] positions = {393, 247, 507, 489, 459, 756, 152, 694, 224, 368, 704, 714, 948, 600, 206, 849, 64, 20, 231, 81, 397, 933, 566};
		int L = 25;
		int result = countReachableIslands(positions,L);
		System.out.println(result);
	}

	private static int countReachableIslands(int[] positions, int L) {
		int counter = 1;
		int startingPosition = positions[0];
		Arrays.sort(positions);
		int current = indexOf(positions,startingPosition);
		for (int i = current+1; i < positions.length; i++) {
			if (positions[i]-positions[i-1]<=L)
				counter++;
			else break;
		}
		for (int i = current-1; i >=0; i--) {
			if (positions[i+1]-positions[i]<=L)
				counter++;
			else break;
		}
			return counter;
	}

	private static int indexOf(int[] positions, int startingPosition) {
		for (int i = 0; i < positions.length; i++) {
			if(startingPosition==positions[i])
				return i;
		}
		return -1 ;
	}

}
