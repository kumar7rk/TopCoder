package TopCoder;

public class blockTower{
	public static void main(String[]args){
		
		int []blockHeights = 
			{24, 20, 3, 9, 20, 12, 27, 16, 30, 29, 43, 8, 27, 38, 42, 1, 25, 34, 8, 23, 27, 22, 47, 39, 41, 41, 44, 12, 24, 36, 19, 37, 46, 9, 27, 22, 34, 12, 46, 41, 36, 42, 11, 45, 20, 2, 27, 46, 50, 19}	//			{44,3,44,3,44,47,2,47,2,47,2}
		;
		int res = getTallest(blockHeights);
		System.out.println(res);
	}
	public static int getTallest(int[] blockHeights){
		
		int res = 0;
		for (int i = 0; i < blockHeights.length; i++) {
			int temp = 0;
			int j = 0;
			for (; j < i; j++) {
				if (blockHeights[j]%2==0) {
					temp+=blockHeights[j];
				}
			}
			for (; j < blockHeights.length; j++) {
				if (blockHeights[j] %2!=0)  {
					temp+=blockHeights[j];
				}
			}
			res = Math.max(res, temp);
		}
		return res;
	}
}
/*
 * int count = 0;
		int val1 = 0;
		int val2 = 0;
		int flag = 0;
		int next = 1;
		
		count = blockHeights[0];
		while (next < blockHeights.length) {
			val1 = blockHeights[flag];
			val2 = blockHeights[next];
//			if (next>flag) {
			if (val2>=val1) {
				// first - odd, second - even
				if ((val1 %2 != 0 && val2%2==0) || val1 %2==0 || (val1%2 !=0 && val2%2 !=0)) {
					count+=val2;
					flag = next;
					next++; 
					System.out.println(flag+ " " +val2);
				}
				else if (val1 %2==0 && val2%2 ==0) {
					count+=val2;
					flag = next;
					next++; 
					System.out.println(flag+ " me " +val2);
				}
				else next++;
			}
			else {
				System.out.println("I ran once as well");
				next++;
			}
			}
		return count;
 */