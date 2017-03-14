package TopCoder;

import java.util.ArrayList;

public class RugSizes {

	public static void main(String[] args) {
		
		int area = 54;
		int res = rugCount(area);
		System.out.println(res);
	}
	public static int rugCount(int area){
		
		ArrayList<Integer> factors = new ArrayList<>();
		int count = 0;
		for (int i = 1; i <= area; i++) {
			if (area%i ==0) {
				factors.add(i);
			}
		}
//		System.out.println(factors);
		for (int i = 0; i < factors.size(); i++) {
			for (int j = i; j < factors.size(); j++) {
				int ith = factors.get(i);
				int jth = factors.get(j);
				if (ith%2==0 && jth%2==0 && i!=j) {
					continue;
				}
				int mul = ith*jth;
//				System.out.println(ith+"*"+jth +"=" + mul);
				if (mul == area) {
					count++;
				}
			}
			
		}
		
		return count;
	}

}
