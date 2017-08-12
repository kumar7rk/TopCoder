package TopCoder;

public class PassingGrade {

	public static void main(String[] args) {
		int[] pointsEarned = 
			{ 7, 8, 7, 6 }
		;
		int[] pointsPossible = 
			{ 8, 8, 8, 8 }
		;
		int finalExam = 9;
		int res = pointsNeeded(pointsEarned,pointsPossible,finalExam);
		System.out.println(res);
	}
	public static int pointsNeeded(int[] pointsEarned, int[] pointsPossible, int finalExam) {
		int sum = finalExam;
		for (int i : pointsPossible) sum+=i;
		sum = (int)Math.ceil(0.65*sum);
		for (int i : pointsEarned) sum-=i;
		if (sum<0) return 0;
		if (sum<=finalExam) return sum;
		return -1;
	}
}