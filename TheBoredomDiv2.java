package TopCoder;

public class TheBoredomDiv2 {

	public int find(int n, int m, int j, int b){

		int count = n;
		if (j <=n && b <=n) return count;
		if (j>n) count++;
		if (b>n) count++;
		return count;
	}
}
