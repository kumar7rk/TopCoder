package TopCoder;

import java.util.Arrays;

public class DiskSpace {

	public static void main(String[] args) {
		int[] used = {16, 553, 88, 827, 287, 266, 133, 94, 513, 362, 70, 213, 91, 124, 224};
		int[] total = {389, 997, 689, 870, 551, 307, 899, 762, 870, 395, 455, 611, 147, 482, 444};
		int res = minDrives(used,total);
		System.out.println("Res: "+res);
	}

	public static int minDrives(int[] used, int[] total) {
		int total_used = 0;
		int total_total = 0;
		
		for (int i : used) total_used+=i;
		Arrays.sort(total);
		for (int i = total.length-1; i >=0; i--) {
			total_total+=total[i];
			if (total_used<=total_total) return total.length-i;
		}
		return 0;
	}
}