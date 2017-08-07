package TopCoder;

public class BlockTower {
	public static void main(String[]args){
		int []blockHeights = {48,1,50,1,50,1,48};
		int res = getTallest(blockHeights);
		System.out.println(res);
	}
	public static int getTallest(int[] blockHeights){
		int res = 0;
		for (int i = 0; i <= blockHeights.length; i++) {
			int temp = 0;
			int j = 0;
			for (; j < i; j++) 
				if (blockHeights[j]%2==0) 
					temp+=blockHeights[j];
			
			for (; j < blockHeights.length; j++) 
				if (blockHeights[j] %2==1) 
					temp+=blockHeights[j];
			res = Math.max(res, temp);
		}
		return res;
	}
}