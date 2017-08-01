package TopCoder;

public class TransportCounting{
	public static void main(String []args){
		int speed = 631;
		int[] positions =  {790, 657, 142, 760, 577, 263, 612, 660, 847, 270, 433, 486, 392, 191, 595, 657, 160, 252, 825, 665, 617, 213, 844, 902, 798};
		int[] velocities =  {750, 790, 764, 306, 454, 315, 808, 86, 461, 709, 770, 481, 310, 29, 516, 113, 541, 328, 846, 709, 535, 371, 564, 452, 649};
		int time = 516;
		int res = countBuses(speed, positions, velocities, time);
		System.out.println(res);
	}
	public static int countBuses(int speed, int[] positions, int[] velocities, int time){
		int distance[] = new int[positions.length];
		int my_distance = speed*time;
		int res = 0;
		for(int i = 0; i < positions.length; i++){
			distance[i] = positions[i]+ velocities[i]*time;
			if(distance[i]<=my_distance || positions[i] == 0)
				res++;
		}
		return res;
	}
}