package TopCoder;

import java.util.Arrays;

public class ContestCoordinator {

	public static void main(String[] args) {
		int[] scores = {5, 3, 3, 10, 10, 4, 3, 10, 10, 3, 9, 5, 7, 10};
		double res = bestAverage(scores);
		System.out.println(res);
	}

	public static double bestAverage(int[] scores) {
		double max = Double.MIN_VALUE;
		double initSum = 0;
		for (int i : scores) {
			initSum+= i;
		}
		max = initSum/scores.length;
		
		Arrays.sort(scores);
		for (int i = 1; i < (scores.length)/2+1; i++) {
			double average = 0;
			double sum = 0;
			
			int low = i-1;
			int high = scores.length-i;
			
			for (int k = 0; k < scores.length; k++)
				if (k>low && k<high) sum+=scores[k];
			
			average = sum/(high-low-1);
			max = max < average?average:max;
		}
		return max;
	}
}