package TopCoder;

public class MinProduct {

	public static void main(String[] args) {
		int[] amount = 
			{0,1,1,2,1,1,0,0,0,0}
		;
		int blank1 = 2;
		int blank2 = 3;
		long res = findMin(amount,blank1,blank2);
		System.out.println(res);
	}

	public static long findMin(int[] amount, int blank1, int blank2) {
		int b1 = blank1; 
		int b2 = blank2;
		if (blank1>blank2) {
			b1 = blank2;
			b2 = blank1;
		}
		if (amount[0]>=b1) return 0;
		long a = 0;
		long b = 0;
		int last = b1+b2-amount[0];
		int count = 1;
		for (int i = 0; i < last; i++) {
			while(amount[count]==0)
				count++;
			if (i%2==0 && amount[0]<b1){
				a = a*10+count;
				amount[0]++;
			}
			else b = b*10+count;
			amount[count]--;
		}
		return a*b;
	}

}
/*
ArrayList<Integer> arrayList = new ArrayList<>();
		for (int i = 0; i < amount.length; i++) 
			for (int j = 0; j < amount[i]; j++) arrayList.add(i);
		
		for (int i = 0; i < blank1+blank2; i++) System.out.print(arrayList.get(i)+ ", ");
		System.out.println();
		long mul = 1;
		
//		int [] taken = new int[blank1+blank2];
		
		for (int i = 0; i < blank1+blank2-1; i++) {
			String A = "";
			String B = "";
			A += arrayList.get(i);
			for (int j = i+1; j < blank1+blank2; j++) {
				if (i==j) continue;
				A += arrayList.get(j);
				B += arrayList.get(j);
			}
			System.out.println(A + " " + B);
			mul = Long.parseLong(A)*Long.parseLong(B);
			System.out.println(mul);
		}
		return 0; 
 */
