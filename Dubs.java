package TopCoder;

public class Dubs {
	public static void main(String[] args) {
		long L = 113464799236l;
		long R = 699002764401l;
		long res = count(L,R);
		System.out.println(res);
	}
	public static long count(long L, long R) {
		long counter = 0;
		long tempL = L;
		while (tempL % 100 !=0 && tempL <= R) {
			if ((tempL/10)%10 == tempL%10) counter++;
			tempL++;
		}
		long tempR = R;
		while (tempR % 100 !=0 && tempR > tempL) {
			if ((tempR/10)%10 == tempR%10) counter++;
			tempR--;
		}
		counter += (tempR-tempL)/100 *10;
		counter += (tempR%100== 0)? 1: 0;
		return counter;
	}
}