package TopCoder;

public class DinkyFish {

	public static void main(String[] args) {
		int tankVolume = 431131
				;
		int maleNum = 764
				;
		int femaleNum = 249;
		int res = monthsUntilCrowded(tankVolume,maleNum,femaleNum);
		System.out.println(res);
	}

	public static int monthsUntilCrowded(int tankVolume, int maleNum, int femaleNum) {
		int total = maleNum+femaleNum;
		int months = 0;
		int couple = Math.min(maleNum, femaleNum);
		while (total*0.5<=tankVolume) {
			total+= (2*couple);
			couple*=2;
			months++;
		}
		return months;
	}

}
