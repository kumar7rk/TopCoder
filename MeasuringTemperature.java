package TopCoder;

public class MeasuringTemperature {

	public static void main(String[] args) {
		int[] measuredValues = {10, 13, 10};
		double res = averageTemperature(measuredValues);
		System.out.println(res);
	}

	public static double averageTemperature(int[] measuredValues) {
		double sum = 0;
		double count = 0;
		for (int i = 0; i < measuredValues.length; i++) {
			if (valid(i,measuredValues)) {
				sum+=measuredValues[i];
				count++;
			}
		}
		if (count==0) return -300.0;
		return sum/count;
	}

	private static boolean valid(int i, int[] values) {
		if (values[i] < -273) return false;
		int min = i-2;
		int max = i+2;
		
		min = min<0? 0 : min;
		max = max> values.length-1 ? values.length-1 : max;

		int count = 0;
		for (int j = min; j <= max; j++) {
			if (Math.abs(values[j]-values[i])>2) count++;
		}
		if (count == max-min) return false;
		return true;
	}

}
