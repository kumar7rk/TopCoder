package TopCoder;

public class ContiguousCacheEasy {

	public static void main(String[] args) {
		int n = 100;
		int k = 1;
		int[] addresses = 
			{0, 4, 6, 6, 4, 10}
		;
		int res = bytesRead(n,k,addresses);
		System.out.println(res);
	}

	public static int bytesRead(int n, int k, int[] addresses) {
		int min = 0;
		int max = k-1;
		int res = 0;
		for (int i = 0; i < addresses.length; i++) {
			if (addresses[i]>=min&&addresses[i]<=max) {
			}
			else{
				if (addresses[i]>max) {
					if (addresses[i]-max>k) res+=k;
					else res+=addresses[i]-max;
					max = addresses[i];
					min = max-k+1;
				}
				else if(addresses[i]<min){
					if (min-addresses[i]>k) res+=k;
					else res+=min-addresses[i];
					min = addresses[i];
					max = min+k-1;
				}
			}
			System.out.println(addresses[i]+" "+ min + " "+max+" " +res);
		}
		return res;
	}

}
