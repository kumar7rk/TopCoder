package TopCoder;

public class RangeEncoding {

	public static void main(String[] args) {
		int[] arr = {2,4,5,6,8,9,10,11,12,15}
;
		int res = minRanges(arr);
		System.out.println(res);
	}

	public static int minRanges(int[] arr) {
		int count = 1;
		for (int i = 0; i < arr.length-1; i++) {
			int current = arr[i];
			int next = arr[i+1];
			if (next!=current+1) {
				count++;
			}
		}
		return count;
	}

}
