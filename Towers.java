package TopCoder;

public class Towers {

	public static void main(String[] args) {
		
		int myUnits = 10;
		int hpT = 6;
		int attackT = 8;
		int numT = 2;
		int res = attack(myUnits,hpT,attackT,numT);
		System.out.println(res);

	}
	public static int attack(int myUnits, int hpT, int attackT, int numT) {

		int i = 0;
		int total =numT*hpT;
		while (true) {
			System.out.println((i+1)+" round: ");
			if (myUnits<=0||total<=0) break;
			total-=myUnits;
			System.out.println("Total hpT:"+total);
			if (total<0) total = 0;
			
			double towersLeft = (double)total/(double)hpT;
			
			if ((int)towersLeft!=towersLeft) towersLeft= (int)towersLeft+1;
			System.out.println("Towers Killed:"+towersLeft);
			
			myUnits -=(towersLeft*attackT);
			++i;
		}
		if (total<=0) return i;
		return -1;
	}

}
