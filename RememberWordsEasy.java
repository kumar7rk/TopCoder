package TopCoder;

public class RememberWordsEasy {

	public static void main(String[] args) {
		int d1 = 3;
		int d2 = 5;
		int w1 = 300;
		int w2 = 500;
		String res = isPossible(d1,d2,w1,w2);
		System.out.println(res);
	}

	public static String isPossible(int d1, int d2, int w1, int w2) {
		int[] x = new int[d1+d2];
		boolean first = false;
		boolean second = false;
		int sum = 0;
		int start = w1/d1;
		for (int i = start;i<Integer.MAX_VALUE; i++) {
			System.out.println("********************"+"i="+i+"********************");
			int count = 0;
			for (int j = i;; j++) {
				System.out.println("j="+j);

				count++;
				sum+=j;
				
				System.out.println(sum);
				if(count==d1){
					System.out.println("j==d1");
					if(sum == w1){
						System.out.println("sum==w1");
						first = true;
					}
					else{
						sum = 0;
						break; 
					}
					sum = 0;
				}
				if(count==d1+d2){
					System.out.println("j==d1+d2");
					if(sum == w2){
						System.out.println("sum==w2");
						second = true;
					}
				}
				if(count>d1+d2){
					System.out.println("j>d1+d2");
					break;
				}
				if (first&&second) return "Possible";
			}
		}
		return "Impossible";
	}
}
