package TopCoder; 
 
public class SquareMaking { 
 
	public static void main(String[] args) {
 
		int a = 705451;
		int b = 751563;
		int c = 608515;
		int d = 994713;
		 
		int res = getMinimalPrice(a,b,c,d);
		System.out.println(res);
	} 
 
	public static int getMinimalPrice(int a, int b, int c, int d) {
		 
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		if (a==b && b==c && c==d) return 0;
		count1 = Math.abs(a-b) + Math.abs(a-c) + Math.abs(a-d);
		count2 = Math.abs(a-b) + Math.abs(a-c) + Math.abs(a-d);
		count3 = Math.abs(a-b) + Math.abs(a-c) + Math.abs(a-d);
		count4 = Math.abs(a-b) + Math.abs(a-c) + Math.abs(a-d);
		 
		int count = Math.min(count1,Math.min(count2,Math.min(count3,count4)));
		return count;
	} 
 
} 