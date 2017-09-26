package TopCoder;

public class FlightDataRecorder {

	public static void main(String[] args) {
		int[] heading = 
//				{90,0}
			{76,321,214,132,0,359,74,65,213}
		;
		int[] distance = 
//			{3,4}
			{621,235,698,1,35,658,154,426,965}
		;
		double res = getDistance(heading,distance);
		System.out.println("Res: "+res);
	}
	public static double getDistance(int[] heading, int[] distance) {
		double sum = 0;
		for (int i = 0; i < distance.length; i++) {
			double d = Math.toRadians(heading[i]);
			double d1 = Math.abs(d*distance[i]);
			System.out.println(d1);
//			sum+= (d*distance[i]);
			sum+=d1;
		}
		return sum;
	}
}
