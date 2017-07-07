package TopCoder;

public class CountGame {

	public static void main(String[] args) {
		int maxAdd = 3;
		int goal = 20;
		int next = 10;
		int res = howMany(maxAdd, goal, next);
		System.out.println(res);

	}

	public static int howMany(int maxAdd, int goal, int next) {
		int res = (goal-next+1)%(maxAdd+1);
		if(res==0)return -1;
		return res;
	}

}
