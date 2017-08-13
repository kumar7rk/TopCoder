package TopCoder;

public class ClockWalk {

	public static void main(String[] args) {
		String flips = "hththththththththththth";
		int res = finalPosition(flips);
		System.out.println("RES: "+res);
	}
	public static int finalPosition(String flips) {
		int hr = 12;
		for (int i = 1; i <= flips.length(); i++) {
			if (flips.charAt(i-1)=='h'){ 
				hr+=i;
				if (hr>12){
					hr %=12;
				}
			}
			if (flips.charAt(i-1)=='t'){
				hr-=i;
				if (hr<1){
					hr = Math.abs(hr)%12;
					hr=12-hr;
				}
			}
			System.out.println(hr);
		}
		return hr;
	}

}
