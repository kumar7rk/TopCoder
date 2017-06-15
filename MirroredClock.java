package TopCoder;

public class MirroredClock {

	public static void main(String[] args) {
		String time = "10:00";
		String res = whatTimeIsIt(time);
		System.out.println(res);
	}

	public static String whatTimeIsIt(String time) {
		String [] timeHM = time.split(":");
		String hours = timeHM[0];
		String minutes = timeHM[1];
		
		if (hours.equals("00") && minutes.equals("00")) return "00:00";
		
		if(Integer.parseInt(minutes)!=0) hours = (Integer.parseInt(hours)+1)+"";
		
		String H = Math.abs((12-Integer.parseInt(hours)))+"";
		String M = Math.abs((60-Integer.parseInt(minutes)))+"";
		
		if (M.equals("60")) M = "00";
		if (H.length()==1) H = "0".concat(H);
		if (M.length()==1) M = "0".concat(M);
		String res = H.concat(":").concat(M);
		return res;
	}
}
