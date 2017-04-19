package TopCoder;

public class InsertZ {

	public static void main(String[] args) {
	
		String init = "fox";
		String goal = "fozx";
		String res = canTransform(init, goal);
		System.out.println(res);
	}
	public static String canTransform(String init, String goal){
		
		goal = goal.replaceAll("z", "");
		if (init.equals(goal)) return "Yes";
		return "No";
	}

}
