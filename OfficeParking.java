package TopCoder;

public class OfficeParking {

	public static void main(String[] args) {
		String[] events = 
			{"a arrives", "aa arrives", "aaa arrives", "aa departs", "aaaa arrives", "baa arrives", "aaa departs", "baa departs", "caaaa arrives"}	
		;
		int res = spacesUsed(events);
		System.out.println(res);

	}

	public static int spacesUsed(String[] events) {
		int count = 0;
		int max = 0;
		for (int i = 0; i < events.length; i++) {
			String[] s = events[i].split(" ");
			if (s[1].equals("arrives")){
				count++;
				max = count>max?count:max;
			}
			if (s[1].equals("departs")) count--; 			
		}
		return max;
	}

}
